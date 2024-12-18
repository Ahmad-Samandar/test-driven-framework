package com.mycompany.tddframework.config;

/**
 * ApplicationConfig holds constants and settings that apply across the entire application.
 */
public class ApplicationConfig {

    // Application-wide constants
    public static final String APP_NAME = "TDD Framework";
    public static final String VERSION = "1.0.0";

    // Environment settings
    public static final String ENV = System.getProperty("env", "dev");

    // Example API URLs (change depending on the environment)
    public static final String BASE_URL = ENV.equals("prod")
            ? "https://api.production.com"
            : "https://api.staging.com";

    // Logging configuration
    public static final boolean ENABLE_DEBUG_LOGGING = ENV.equals("dev");
}
