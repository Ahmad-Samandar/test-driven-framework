package com.mycompany.tddframework.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ExcelUtils provides utility methods for reading Excel files.
 */
public class ExcelUtils {

    /**
     * Reads data from an Excel file and returns it as a list of rows.
     *
     * @param fileName The name of the Excel file (located in src/main/resources).
     * @return A list of rows, where each row is a list of cell values as Strings.
     * @throws IOException If the file cannot be read.
     */
    public static List<List<String>> readExcelFile(String fileName) throws IOException {
        List<List<String>> data = new ArrayList<>();

        // Load the Excel file
        FileInputStream fis = new FileInputStream(new File(
                Objects.requireNonNull(ExcelUtils.class.getClassLoader().getResource(fileName)).getFile()));

        // Open the workbook and get the first sheet
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        // Iterate over rows
        for (Row row : sheet) {
            List<String> rowData = new ArrayList<>();
            for (Cell cell : row) {
                rowData.add(cell.toString());
            }
            data.add(rowData);
        }

        // Close the workbook and input stream
        workbook.close();
        fis.close();

        return data;
    }
}
