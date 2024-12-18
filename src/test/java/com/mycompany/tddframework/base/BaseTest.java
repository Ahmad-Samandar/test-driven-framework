package com.mycompany.tddframework.base;

import com.mycompany.tddframework.config.PropertiesLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.BeforeEach;

/**
 * BaseTest provides shared setup and utility methods for test classes.
 */
public abstract class BaseTest {

    private static final Logger logger = LogManager.getLogger(BaseTest.class);

    protected String baseUrl;
    protected boolean debugLogging;

    @BeforeEach
    public void setUp() {
        // Load common configurations for tests
        baseUrl = PropertiesLoader.get("base.url");
        debugLogging = Boolean.parseBoolean(PropertiesLoader.get("enable.debug.logging", "false"));

        // Set the log level based on the debugLogging flag
        if (debugLogging) {
            Configurator.setRootLevel(org.apache.logging.log4j.Level.DEBUG);
            logger.debug("Debug logging is enabled");
        } else {
            Configurator.setRootLevel(org.apache.logging.log4j.Level.INFO);
        }

        // Log the base URL
        logger.info("Base URL: {}", baseUrl);
    }

    // Utility method for logging messages
    protected void log(String message) {
        if (debugLogging) {
            logger.debug(message);
        } else {
            logger.info(message);
        }
    }
}
