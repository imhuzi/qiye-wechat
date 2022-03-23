package chat.qiye.wechat.sdk.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/8/30
 */
public class ConfigUtil {
    public static final String CLASSPATH_FILE_FLAG = "classpath:";

    public static Properties loadProperties(String fileName) {
        if (StringUtil.isNotBlank(fileName)) {
            if (absolutePathStart(fileName)) {
                return loadPropertiesFromAbsoluteFile(fileName);
            } else {
                return fileName.startsWith(CLASSPATH_FILE_FLAG) ? loadPropertiesFromClasspathFile(fileName) : loadPropertiesFromRelativeFile(fileName);
            }
        } else {
            return null;
        }
    }

    private static Properties loadPropertiesFromAbsoluteFile(String fileName) {
        Properties properties = null;

        try {
            File file = new File(fileName);
            if (!file.exists()) {
                return null;
            }

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), getCharset()));
            Throwable var4 = null;

            try {
                properties = new Properties();
                properties.load(bufferedReader);
            } catch (Throwable var14) {
                var4 = var14;
                throw var14;
            } finally {
                if (bufferedReader != null) {
                    if (var4 != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable var13) {
                            var4.addSuppressed(var13);
                        }
                    } else {
                        bufferedReader.close();
                    }
                }

            }
        } catch (Throwable var16) {
            var16.printStackTrace();
        }

        return properties;
    }

    private static boolean absolutePathStart(String path) {
        File[] files = File.listRoots();
        File[] var2 = files;
        int var3 = files.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            File file = var2[var4];
            if (path.startsWith(file.getPath())) {
                return true;
            }
        }

        return false;
    }

    private static Properties loadPropertiesFromClasspathFile(String fileName) {
        fileName = fileName.substring(CLASSPATH_FILE_FLAG.length()).trim();
        ArrayList list = new ArrayList();

        try {
            Enumeration<URL> urls = getClassLoader().getResources(fileName);
            list = new ArrayList();

            while(urls.hasMoreElements()) {
                list.add(urls.nextElement());
            }
        } catch (Throwable var20) {
            var20.printStackTrace();
        }

        if (list.isEmpty()) {
            return null;
        } else {
            Properties properties = new Properties();
            Iterator var3 = list.iterator();

            while(var3.hasNext()) {
                URL url = (URL)var3.next();

                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), getCharset()));
                    Throwable var6 = null;

                    try {
                        Properties p = new Properties();
                        p.load(bufferedReader);
                        properties.putAll(p);
                    } catch (Throwable var17) {
                        var6 = var17;
                        throw var17;
                    } finally {
                        if (bufferedReader != null) {
                            if (var6 != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable var16) {
                                    var6.addSuppressed(var16);
                                }
                            } else {
                                bufferedReader.close();
                            }
                        }

                    }
                } catch (Throwable var19) {
                    var19.printStackTrace();
                }
            }

            return properties;
        }
    }

    private static Properties loadPropertiesFromRelativeFile(String fileName) {
        String userDir = System.getProperty("user.dir");
        String realFilePath = addSeparator(userDir) + fileName;
        return loadPropertiesFromAbsoluteFile(realFilePath);
    }

    private static ClassLoader getClassLoader() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = ConfigUtil.class.getClassLoader();
        }

        return classLoader;
    }

    private static Charset getCharset() {
        return Charset.forName(System.getProperty("qiye.wecaht.charset", StandardCharsets.UTF_8.name()));
    }

    public static String addSeparator(String dir) {
        if (!dir.endsWith(File.separator)) {
            dir = dir + File.separator;
        }

        return dir;
    }

    private ConfigUtil() {
    }

}
