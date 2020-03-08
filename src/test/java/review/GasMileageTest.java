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

public class GasMileageTest {

    XSSFWorkbook workbook;
    XSSFSheet sheet;

    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    CalculationOfGasPage calculationOfGasPage = new CalculationOfGasPage();


//    XSSFRow row;
//    XSSFCell cell;
    @Test
    public void gasMileageCalculation() throws Exception{
        Driver.getDriver().get("https://www.calculator.net/gas-mileage-calculator.html");
        fileInputStream = new FileInputStream("./src/test/resources/testData/GasMileageCalculation.xlsx");
       workbook = new XSSFWorkbook(fileInputStream);
//       double
       calculationOfGasPage.currentOdo.clear();
    calculationOfGasPage.currentOdo.sendKeys();

    }
}
