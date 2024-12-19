package com.mycompany.tddframework.tests;

import com.mycompany.tddframework.base.BaseTest;
import com.mycompany.tddframework.utils.ExcelUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExcelUtilsTest extends BaseTest {

    @Test
    public void testReadExcelFile() throws IOException {
        // Read data from sample.xlsx
        List<List<String>> excelData = ExcelUtils.readExcelFile("user.xlsx");

        // Assert the data is not null
        assertNotNull(excelData, "Excel data should not be null");

        // Assert the data contains 4 rows (including header)
        assertEquals(4, excelData.size(), "Excel should contain 4 rows");

        // Assert specific cell values
        assertEquals("ID", excelData.get(0).get(0), "First cell in header row should be 'ID'");
        assertEquals("John Doe", excelData.get(1).get(1), "Second row, second cell should be 'John Doe'");
        assertEquals("alice.lee@gmail.com", excelData.get(3).get(2), "Fourth row, third cell should be Alice's email");

        // Print rows and columns
        System.out.println("Excel Data:");
        for (int i = 0; i < excelData.size(); i++) {
            List<String> row = excelData.get(i);
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j) + (j == row.size() - 1 ? "" : " | "));
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }

}
