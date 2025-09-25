package tests.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;
import pages.LoginPage;
import steps.*;
import utils.PropertyReader;
import utils.TestListener;

import java.awt.*;

@Listeners(TestListener.class)
public class BaseTest {

    protected LoginPage loginPage;
    protected LoginStep loginStep;
    protected MainPage mainPage;
    protected ProjectPage projectPage;
    protected Checkbox checkbox;
    protected ToDoPage toDoPage;
    protected TestRunPage testRunPage;
    protected TestCasesPage testCasesPage;
    protected MainStep mainStep;
    protected ProjectStep projectStep;
    protected TestCaseStep testCaseStep;
    protected ToDoStep toDoStep;

    protected String user = System.getProperty("user", PropertyReader.getProperty("user"));
    protected String password = System.getProperty("password", PropertyReader.getProperty("password"));

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
