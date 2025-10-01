package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPageElements {

    // ===== Inputs =====
    public static SelenideElement EMAIL_FIELD = $x("//*[@id='name']");
    public static SelenideElement PASSWORD_FIELD = $x("//*[@id='password']");
    // ===== Buttons =====
    public static SelenideElement LOGIN_BUTTON = $x("//*[@id='button_primary']");
    public static SelenideElement KEEP_AUTH = $x("//span[@class='loginpage-checkmark']");
    // ===== Error Messages =====
    public static SelenideElement ERROR_MESSAGE = $x("//div[@class='loginpage-message-image loginpage-message ']");
    public static SelenideElement ERROR_POPUP = $x("//span[@class='error-on-top']");
    public static String ERROR_TEXT = "Email/Login is required.";
    public static String ERROR_PASSWORD_TEXT = "Password is required.";
}
