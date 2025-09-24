package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import steps.LoginStep;

import java.awt.*;

public class BaseTest {

    LoginPage loginPage;
    LoginStep loginStep;
    MainPage mainPage;
    ProjectPage projectPage;
    Checkbox checkbox;
    ToDoPage toDoPage;
    TestRunPage testRunPage;
    TestCasesPage testCasesPage;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.testrail.com";
        Configuration.timeout = 15000;
        Configuration.clickViaJs = true;
        //Configuration.headless = true;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        Configuration.browserCapabilities = options;
//        Configuration.assertionMode = AssertionMode.SOFT;

        loginStep = new LoginStep();
        loginPage = new LoginPage();
        mainPage = new MainPage();
        projectPage = new ProjectPage();
        checkbox = new Checkbox();
        toDoPage = new ToDoPage();
        testRunPage = new TestRunPage();
        testCasesPage = new TestCasesPage();
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
