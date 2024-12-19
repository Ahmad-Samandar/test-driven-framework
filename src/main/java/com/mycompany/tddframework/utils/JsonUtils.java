package com.mycompany.tddframework.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * JsonUtils provides utility methods for reading JSON files.
 */
public class JsonUtils {

    /**
     * Reads the contents of a JSON file and returns it as a String.
     *
     * @param fileName The name of the JSON file (located in src/main/resources).
     * @return The contents of the JSON file as a String.
     * @throws IOException If the file cannot be read.
     */
    public static String readJsonFile(String fileName) throws IOException {
        // Get the file path from the resources directory
        String filePath = Objects.requireNonNull(JsonUtils.class.getClassLoader().getResource(fileName)).getPath();
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
