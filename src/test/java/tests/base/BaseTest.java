package tests.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import steps.*;

import java.awt.*;

public class BaseTest {

    public LoginPage loginPage;
    public LoginStep loginStep;
    public MainPage mainPage;
    public ProjectPage projectPage;
    public Checkbox checkbox;
    public ToDoPage toDoPage;
    public TestRunPage testRunPage;
    public TestCasesPage testCasesPage;
    public MainStep mainStep;
    public ProjectStep projectStep;
    public TestCaseStep testCaseStep;
    public ToDoStep toDoStep;

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
