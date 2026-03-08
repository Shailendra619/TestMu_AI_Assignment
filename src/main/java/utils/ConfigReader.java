package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static void loadConfig() {

        try {

            prop = new Properties();

            InputStream input =
                    ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            prop.load(input);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static String getBrowser() {

        return prop.getProperty("browser");
    }

    public static String getUrl() {

        return prop.getProperty("url");
    }
}