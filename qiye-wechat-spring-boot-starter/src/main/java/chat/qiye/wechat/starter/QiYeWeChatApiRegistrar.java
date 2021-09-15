package chat.qiye.wechat.starter;

import chat.qiye.wechat.sdk.annotation.QiYeWeChatApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.beans.Introspector;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Registrar to register {@link QiYeWeChatApi }s.
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/11
 */
@Slf4j
public class QiYeWeChatApiRegistrar implements ImportBeanDefinitionRegistrar, ResourceLoaderAware, EnvironmentAware {
    private static final String BASE_PACKAGES_KEY = "qiye.wechat.base-packages";
    private static final String DEFAULT_BASE_PACKAGES = "chat.qiye.wechat.sdk.api";

    private Environment environment;
    private ResourceLoader resourceLoader;

    /**
     * Trigger registering QiYeWeChat Api feign clients, but actually metadata and registry are not used at all.
     *
     * @param metadata annotation metadata of the importing class.
     * @param registry current bean definition registry.
     * @see org.springframework.context.annotation.ImportBeanDefinitionRegistrar
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        registerQiYeWeChatApis(metadata, registry);
    }

    /**
     * Scan all interfaces declared with &#64; QiYeWeChatApi and collect className, attributes, and logLevel.
     */
    public void registerQiYeWeChatApis(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        ClassPathScanningCandidateComponentProvider scanner = getScanner();
        scanner.setResourceLoader(resourceLoader);

        AnnotationTypeFilter annotationTypeFilter = new AnnotationTypeFilter(QiYeWeChatApi.class);
        scanner.addIncludeFilter(annotationTypeFilter);
        List<String> basePackages = Arrays.asList(Optional.ofNullable(environment.getProperty(BASE_PACKAGES_KEY))
                .orElse(DEFAULT_BASE_PACKAGES)
                .split(","));

        basePackages.stream()
                .map(scanner::findCandidateComponents)
                .flatMap(Collection::stream)
                .filter(bd -> bd instanceof AnnotatedBeanDefinition)
                .map(bd -> (AnnotatedBeanDefinition) bd)
                .map(AnnotatedBeanDefinition::getMetadata)
                .filter(ClassMetadata::isInterface)
                .forEach(meta -> {
                    Map<String, Object> attributes = meta.getAnnotationAttributes(QiYeWeChatApi.class.getCanonicalName());
                    registerQiYeWeChatApi(registry, meta.getClassName(), attributes);
                });
    }

    /**
     * Register generated QiYeWeChat Api feign clients as singletons.
     *
     * @param registry   registry.
     * @param className  class name of the interface which declared with &#64;QiYeWeChatApi.
     * @param attributes attributes of the &#64;QiYeWeChatApi annotation.
     */
    private void registerQiYeWeChatApi(BeanDefinitionRegistry registry, String className, Map<String, Object> attributes) {
        String shortClassName = ClassUtils.getShortName(className);
        String beanName = Introspector.decapitalize(shortClassName);

        Class<?> apiType = null;
        try {
            apiType = Class.forName(className);
        } catch (Exception e) {
            log.error("{} Class Not Found", className, e);
        }

        BeanDefinitionBuilder definition = BeanDefinitionBuilder.genericBeanDefinition(QiYeWeChatApiFactoryBean.class);

        definition.addPropertyValue("apiType", apiType);
        definition.addPropertyValue("attributes", attributes);
        definition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);

        AbstractBeanDefinition beanDefinition = definition.getBeanDefinition();
        beanDefinition.setAttribute(FactoryBean.OBJECT_TYPE_ATTRIBUTE, className);

        BeanDefinitionHolder holder = new BeanDefinitionHolder(beanDefinition, beanName);
        BeanDefinitionReaderUtils.registerBeanDefinition(holder, registry);
    }

    /**
     * Get the class path scanner.
     *
     * @return scanner.
     */
    private ClassPathScanningCandidateComponentProvider getScanner() {
        return new ClassPathScanningCandidateComponentProvider(false, environment) {
            @Override
            protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
                if (!beanDefinition.getMetadata().isIndependent()) {
                    return false;
                }
                return !beanDefinition.getMetadata().isAnnotation();
            }
        };
    }

    /**
     * Set the ResourceLoader that this object runs in.
     *
     * @param resourceLoader the ResourceLoader object to be used by this object.
     * @see org.springframework.context.ResourceLoaderAware
     */
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    /**
     * Set the {@code Environment} that this component runs in.
     *
     * @see org.springframework.context.EnvironmentAware
     */
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
