package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WritingOnExcel {

    public static void dataTransferToExcel(){



        //Headings
        String [] row_heading={"Name","Age","Role"};

        //data in obj(userdetails)
        List<UserDetails> userDetails=createUser();

        XSSFWorkbook excel=new XSSFWorkbook();

        XSSFSheet sheet=excel.createSheet("UserDetails");

        Row heading=sheet.createRow(0);

        for(int i=0;i<row_heading.length;i++)
        {
            Cell cell=heading.createCell(i);
            cell.setCellValue(row_heading[i]);
        }

        for (int i=0;i<userDetails.size();i++)
        {
            Row data=sheet.createRow(i+1);
            data.createCell(0).setCellValue(userDetails.get(i).getName());
            data.createCell(1).setCellValue(userDetails.get(i).getAge());
            data.createCell(2).setCellValue(userDetails.get(i).getRole());


        }

        FileOutputStream fos;
        try
        {
            fos=new FileOutputStream(new File("C:\\Users\\Developer\\Downloads\\Sridhar\\Source\\User.xlsx"));
            excel.write(fos);
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();

        }

        System.out.println("Inserted Succesfully");


    }

    private static List<UserDetails> createUser() {
        List<UserDetails> user=new ArrayList<>();
        user.add(new UserDetails("Teja",23,"Developer"));
        user.add(new UserDetails("Sridhar",23,"Developer"));
                return user;
    }
}
