package com.mycompany.tddframework.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * PropertiesLoader loads application properties from application.properties.
 */
public class PropertiesLoader {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = PropertiesLoader.class
                .getClassLoader()
                .getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("application.properties not found in resources");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file", e);
        }
    }

    // Get a property value by key
    public static String get(String key) {
        return properties.getProperty(key);
    }

    // Get a property value by key with a default value
    public static String get(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
}

