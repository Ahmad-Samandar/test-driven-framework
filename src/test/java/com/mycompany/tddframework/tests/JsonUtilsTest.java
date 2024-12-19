package com.mycompany.tddframework.tests;

import com.mycompany.tddframework.base.BaseTest;
import com.mycompany.tddframework.utils.JsonUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JsonUtilsTest extends BaseTest {

    @Test
    public void testReadJsonFile() throws IOException {
        // Read the user.json file
        String jsonContent = JsonUtils.readJsonFile("user.json");

        // Assert that the content is not null
        assertNotNull(jsonContent, "The JSON content should not be null");

        // Assert that the content contains specific data from the file
        assertTrue(jsonContent.contains("\"name\": \"John Doe\""), "The JSON content should contain the user's name");
        assertTrue(jsonContent.contains("\"email\": \"john.doe@example.com\""), "The JSON content should contain the user's email");
    }
}
