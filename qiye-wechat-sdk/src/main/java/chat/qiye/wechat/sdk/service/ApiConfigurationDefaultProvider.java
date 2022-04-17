package chat.qiye.wechat.sdk.service;

import chat.qiye.wechat.sdk.api.inner.AccessTokenApi;
import chat.qiye.wechat.sdk.api.inner.resp.AccessTokenResp;
import chat.qiye.wechat.sdk.api.thirdparty.ThirdAccessTokenApi;
import chat.qiye.wechat.sdk.common.AccessTokenInfoVo;
import chat.qiye.wechat.sdk.confg.QiyeWechatAppVo;
import chat.qiye.wechat.sdk.constant.AppIdEnum;
import chat.qiye.wechat.sdk.utils.AssertUtil;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/7/18
 */
@Slf4j
public class ApiConfigurationDefaultProvider implements ApiConfigurationProvider {

    final LoadingCache<String, AccessTokenInfoVo> APP_TOKEN_CACHE;

    final ExecutorService executor;

    public ApiConfigurationDefaultProvider() {

        executor = new ThreadPoolExecutor(3, 5,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());
        APP_TOKEN_CACHE = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .refreshAfterWrite(1, TimeUnit.MINUTES)
                .build(new CacheLoader<String, AccessTokenInfoVo>() {
                    public AccessTokenInfoVo load(String key) { // no checked exception
                        return loadAppToken(key);
                    }

                    public ListenableFuture<AccessTokenInfoVo> reload(final String key, AccessTokenInfoVo prevToken) {
                        if (neverNeedsRefreshToken(prevToken)) {
                            return Futures.immediateFuture(prevToken);
                        } else {
                            // asynchronous!
                            ListenableFutureTask<AccessTokenInfoVo> task = ListenableFutureTask.create(() -> loadAppToken(key));
                            executor.execute(task);
                            return task;
                        }
                    }
                });
    }

    @Override
    public AccessTokenApi getAccessTokenApi() {
        return ApiFactory.getApiBean(AccessTokenApi.class, this);
    }

    @Override
    public ThirdAccessTokenApi getThirdAccessTokenApi() {
        return ApiFactory.getApiBean(ThirdAccessTokenApi.class, this);
    }

    /**
     * 获取 系统 应用 专属 token, 比如 通讯录，客户关系等
     *
     * @param appId {@link AppIdEnum}
     * @return access_token
     */
    @SneakyThrows
    @Override
    public String getAppToken(String appId) {
        return APP_TOKEN_CACHE.get(appId).getAccessToken();
    }

    public AccessTokenInfoVo loadAppToken(String appId) {
        QiyeWechatAppVo configVo = getConfigByAppId(appId);
        AssertUtil.notNull(configVo, "app config is null");
        AssertUtil.notNull(configVo.getCorpId(), "corpId config is null");
        AssertUtil.notNull(configVo.getSecret(), "app Secret config is null");
        AccessTokenResp resp = getAccessTokenApi().accessTokenInfo(configVo.getCorpId(), configVo.getSecret());
        if (!resp.success()) {
            log.error("AccessToken Error:{},{},{}", resp.getErrcode(), resp.getErrmsg(), configVo);
        }
        AccessTokenInfoVo accessTokenInfoVo = new AccessTokenInfoVo();
        accessTokenInfoVo.setApp(appId);
        accessTokenInfoVo.setAccessToken(resp.getAccessToken());
        accessTokenInfoVo.setExpiresIn(resp.getExpiresIn());
        accessTokenInfoVo.setFailureTime(System.currentTimeMillis() + ((resp.getExpiresIn() - 200) * 1000));
        return accessTokenInfoVo;
    }


    /**
     * 第三方 企业 access_token
     *
     * @return access_token
     */
    @Override
    public String getCorpToken(String appId) {
        // 先 获取  suite_access_token

        return null;
    }

    /**
     * 第三方  suite_access_token
     *
     * @return suite_access_token
     */
    @Override
    public String getSuiteToken(String appId) {

        return null;
    }

    /**
     * 服务商  access_token
     *
     * @return access_token
     */
    @Override
    public String getProviderToken() {

        return null;
    }
}
