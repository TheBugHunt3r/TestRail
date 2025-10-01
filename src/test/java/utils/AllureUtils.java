package utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AllureUtils {

    public static void takeScreenshot() {
        try {
            if (WebDriverRunner.hasWebDriverStarted()) {
                byte[] screenshot = Selenide.screenshot(OutputType.BYTES);
                Allure.getLifecycle().addAttachment("Screenshot", "image/png", "png", screenshot);
            } else {
                System.out.println("WebDriver is not started. Cannot take screenshot.");
            }
        } catch (Exception e) {
            System.out.println("Failed to take screenshot: " + e.getMessage());
        }
    }
}
