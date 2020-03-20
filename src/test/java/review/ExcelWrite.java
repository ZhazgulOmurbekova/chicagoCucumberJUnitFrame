package review;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;
        String path = "src/SampleData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Employees");
        row = sheet.getRow(1);
        cell = row.getCell(1);
        XSSFCell adamsCell = sheet.getRow(2).getCell(0);
        System.out.println("Before "+adamsCell);

        adamsCell.setCellValue("Nurgazy");

        System.out.println("after: " + adamsCell);


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if(sheet.getRow(i).getCell(0).toString().equals("Steven")){
                System.out.println("before " + sheet.getRow(i).getCell(0));
                sheet.getRow(i).getCell(0).setCellValue("Tom");
                System.out.println("after " + sheet.getRow(i).getCell(0));
            }
            
        }



        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if(sheet.getRow(i).getCell(0).toString().equals("Neena")){
                System.out.println("before " + sheet.getRow(i).getCell(2));
                sheet.getRow(i).getCell(2).setCellValue("IT");
                System.out.println("after " + sheet.getRow(i).getCell(02));
            }

        }






        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();


    }
}
