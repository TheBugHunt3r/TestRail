package tests.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.AddTestRunPage;
import pages.MainPage;
import pages.OverviewPage;
import pages.TestRunPage;
import steps.*;
import utils.PropertyReader;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    protected LoginStep loginStep;
    protected MainPage mainPage;
    protected MainStep mainStep;
    protected ProjectStep projectStep;
    protected TestCaseStep testCaseStep;
    protected ToDoStep toDoStep;
    protected TestRunPage testRunPage;
    protected TestRunsStep testRunsStep;
    protected AddTestRunPage addTestRunPage;
    protected MilestoneStep milestoneStep;
    protected OverviewPage overviewPage;

    protected String user = System.getProperty("user", PropertyReader.getProperty("user"));
    protected String password = System.getProperty("password", PropertyReader.getProperty("password"));

    @BeforeMethod
    public void setup() {
        String browser = System.getProperty("browser", "chrome");
        boolean headless = Boolean.parseBoolean(System.getProperty("headless", "true"));

        Configuration.browser = browser;
        Configuration.headless = headless;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
        Configuration.browserPosition = "0x0";
        Configuration.clickViaJs = true;
        Configuration.remote = System.getProperty("remote", null);

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            if (headless) {
                options.addArguments("--headless=new");
            }
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--remote-allow-origins=*");
            Configuration.browserCapabilities = options;
        }

        if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
        }

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
                .includeSelenideSteps(false)
        );

        loginStep = new LoginStep();
        mainStep = new MainStep();
        projectStep = new ProjectStep();
        testCaseStep = new TestCaseStep();
        toDoStep = new ToDoStep();
        mainPage = new MainPage();
        testRunPage = new TestRunPage();
        testRunsStep = new TestRunsStep();
        addTestRunPage = new AddTestRunPage();
        milestoneStep = new MilestoneStep();
        overviewPage = new OverviewPage();
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
