package tests;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import steps.LoginStep;

public class BaseTest {

    LoginPage loginPage;
    LoginStep loginStep;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.testrail.com";
        Configuration.timeout = 10000;
        Configuration.clickViaJs = true;
        //Configuration.headless = true;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        Configuration.browserCapabilities = options;
        Configuration.assertionMode = AssertionMode.SOFT;

        loginPage = new LoginPage();
        loginStep = new LoginStep();
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
