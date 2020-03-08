package pages.calculation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CalculationOfGasPage {

    public CalculationOfGasPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "uscodreading")
    public WebElement currentOdo;

    @FindBy(id = "uspodreading")
    public WebElement previousOdo;

    @FindBy(id = "usgasputin")
    public WebElement gasAdded;

    @FindBy(id = "usgasprice")
    public WebElement gasPrice;

    @FindBy(xpath = "(//input[@type='image'])[1]")
    public WebElement calculateButton;

    @FindBy(xpath = "(//img[@class='clearbtn'])[1]")
    public WebElement clearButton;

    @FindBy(xpath = "//b[contains(text(),'mpg')]")
    public WebElement resultGas;
}
