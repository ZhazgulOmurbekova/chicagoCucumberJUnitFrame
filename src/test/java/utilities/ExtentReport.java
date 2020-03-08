package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;

public class ExtentReport {
    private static ExtentHtmlReporter config;
    private static ExtentReports reports;
    private static ExtentTest extentTest;

    static {
        config = new ExtentHtmlReporter("./extentReport/report.html");
        config.config().setTheme(Theme.DARK);
        config.config().setDocumentTitle("B14 Extent Report");
        reports = new ExtentReports();
        reports.attachReporter(config);


    }

    public static void startTest(String testName) {
        extentTest = reports.createTest(testName);

    }

    public static void pass() {
        extentTest.pass("Pass");

    }


    public static void fail(){
        extentTest.fail("FAILED");

    }

    public static void endReport(){
        reports.flush();
    }

}
