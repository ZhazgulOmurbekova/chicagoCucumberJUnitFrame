package mentorings.tuesday.ibraimMentoring;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        List<String > list = Arrays.asList("iphone", "laptop", "cybertek");
        for(String  s : list){
            driver.get("https://google.com/search?q=" + s);
            System.out.println(driver.getTitle());
            Thread.sleep(3000);
        }
    }
}
