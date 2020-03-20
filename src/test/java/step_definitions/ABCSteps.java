package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class ABCSteps {
    @Given("go to home page")
    public void go_to_home_page() {
        Driver.getDriver().get("http://www.google.com");


    }

    @Then("enter nurgazy on search box")
    public void enter_nurgazy_on_search_box() {
        Driver.getDriver().findElement(By.name("a")).sendKeys("Nurgazy" + Keys.ENTER);


    }

    @Then("click on search box")
    public void click_on_search_box() {


    }
}
