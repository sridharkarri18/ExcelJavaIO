package org.example;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile {



    public static void readingData(String file)  {
        XSSFWorkbook excel= null;
        try {
            excel = new XSSFWorkbook(new File(file));
            XSSFSheet sheet=excel.getSheet("UserDetails");
            XSSFRow row=null;

            int i=1;

            while((row = sheet.getRow(i))!=null)
            {

                System.out.println(row.getCell(0).getStringCellValue());
                System.out.println(row.getCell(1).getNumericCellValue());
                System.out.println(row.getCell(2).getStringCellValue());
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }



    }
}
