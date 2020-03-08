package utilities;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestClassLogs {

    public static void main(String[] args) {
        ExtentHtmlReporter config = new ExtentHtmlReporter("./extentReport/report.html");

        config.config().setTheme(Theme.DARK);
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(config);

        System.out.println("start");
        ExtentTest extentTest = reports.createTest("Google Search");

        extentTest.pass("It is pass");

        extentTest.fail("did not match. Fail!");
        reports.flush();
        System.out.println("finish");
















    }
}
