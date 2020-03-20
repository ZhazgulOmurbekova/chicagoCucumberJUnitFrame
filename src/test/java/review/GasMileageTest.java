package review;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import pages.calculation.CalculationOfGasPage;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class GasMileageTest {

    XSSFWorkbook workbook;
    XSSFSheet sheet;

    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    CalculationOfGasPage calculationOfGasPage = new CalculationOfGasPage();


    //    XSSFRow row;
//    XSSFCell cell;
    @Test
    public void gasMileageCalculation() throws Exception {
        Driver.getDriver().get("https://www.calculator.net/gas-mileage-calculator.html");

        String path = "./src/test/java/GasMileageCalculation.xlsx";
        fileInputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Sheet1");

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            XSSFRow currentRow = sheet.getRow(i);


            double current = currentRow.getCell(1).getNumericCellValue();
            calculationOfGasPage.currentOdo.clear();
            calculationOfGasPage.currentOdo.sendKeys(String.valueOf(current));


            double previous = currentRow.getCell(2).getNumericCellValue();
            calculationOfGasPage.previousOdo.clear();
            calculationOfGasPage.previousOdo.sendKeys(String.valueOf(previous));

            double gas = currentRow.getCell(3).getNumericCellValue();
            calculationOfGasPage.gasAdded.clear();
            calculationOfGasPage.gasAdded.sendKeys(String.valueOf(gas));

            calculationOfGasPage.calculateButton.click();

            double expectedResult = (current - previous) / gas;
            System.out.println("expected result " + expectedResult);

            String[] actualResult = calculationOfGasPage.resultGas.getText().split("");
            System.out.println("actual result " + actualResult[0]);


            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            System.out.println("Format version: " + decimalFormat.format(expectedResult));


            if (currentRow.getCell(4) == null) {
                currentRow.createCell(4);
            }

            currentRow.getCell(4).setCellValue(decimalFormat.format(expectedResult));
            //=====================================================

            if (currentRow.getCell(5) == null) {
                currentRow.createCell(5);
            }

            currentRow.getCell(5).setCellValue(actualResult[0]);


            if (String.valueOf(decimalFormat.format(expectedResult)).equals(actualResult[0])) {
                if (currentRow.getCell(6) == null) {
                    currentRow.createCell(5);
                }

                currentRow.createCell(6).setCellValue("Pass");

                System.out.println("Pass");
            } else {
                System.out.println("Failed");
            }

           // currentRow.getCell(7).setCellValue(LocalDateTime.now().toString());
        }
        fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);

        workbook.close();
        fileOutputStream.close();
        fileInputStream.close();
    }
}
