package review;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception{
        File file = new File("src/SampleData.xlsx");
        System.out.println(file.exists());
        FileInputStream fileInputStream= new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Employees");
        ;
        System.out.println(sheet.getRow(2).getCell(1));
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);

        for (int i = 0; i < usedRows; i++) {
            if(sheet.getRow(i).getCell(0).toString().equals("Neena")){
                System.out.println(sheet.getRow(i).getCell(0));
            }
            
        }

        for (int i = 0; i < usedRows; i++) {
            if(sheet.getRow(i).getCell(0).toString().equals("Adam")){
                System.out.println(sheet.getRow(i).getCell(1));
            }

        }
        for (int i = 0; i < usedRows; i++) {
            if(sheet.getRow(i).getCell(0).toString().equals("Steven")){
                System.out.println(sheet.getRow(i).getCell(2));
            }

        }

    }
}
