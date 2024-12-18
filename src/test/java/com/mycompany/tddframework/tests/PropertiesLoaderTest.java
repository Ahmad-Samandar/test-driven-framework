package com.mycompany.tddframework.tests;

import com.mycompany.tddframework.config.PropertiesLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertiesLoaderTest {

    @Test
    public void testGetProperty() {
        // Check if we can retrieve a property
        String appName = PropertiesLoader.get("app.name");
        assertEquals("TDD Framework", appName, "App name should match the value in application.properties");

        // Check if we get a default value when the property is missing
        String nonExistentKey = PropertiesLoader.get("non.existent.key", "Default Value");
        assertEquals("Default Value", nonExistentKey, "Should return default value for missing property");
    }
}
