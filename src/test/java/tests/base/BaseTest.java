package tests.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import pages.*;
import pages.LoginPage;
import steps.*;
import utils.PropertyReader;
import utils.TestListener;

import java.awt.*;

@Listeners(TestListener.class)
public class BaseTest {

    protected LoginStep loginStep;
    protected MainPage mainPage;
    protected MainStep mainStep;
    protected ProjectStep projectStep;
    protected TestCaseStep testCaseStep;
    protected ToDoStep toDoStep;

    protected String user = System.getProperty("user", PropertyReader.getProperty("user"));
    protected String password = System.getProperty("password", PropertyReader.getProperty("password"));

    @BeforeMethod
    public void setUp (ITestContext context) {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.testrail.com";
        Configuration.timeout = 15000;
        Configuration.clickViaJs = true;
        //Configuration.headless = true;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        Configuration.browserCapabilities = options;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
                .includeSelenideSteps(true)
        );

        loginStep = new LoginStep();
        mainStep = new MainStep();
        projectStep = new ProjectStep();
        testCaseStep = new TestCaseStep();
        toDoStep = new ToDoStep();
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
