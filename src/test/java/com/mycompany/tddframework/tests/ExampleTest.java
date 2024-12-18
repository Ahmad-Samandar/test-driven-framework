package com.mycompany.tddframework.tests;

import com.mycompany.tddframework.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExampleTest extends BaseTest {

    @Test
    public void testBaseTestSetup() {
        // Log a test message
        log("Testing BaseTest setup...");

        // Verify that the base URL is not null
        assertNotNull(baseUrl, "Base URL should not be null");

        // Additional logging
        log("Test for Base URL setup completed successfully.");
    }
}


