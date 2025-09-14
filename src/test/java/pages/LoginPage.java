package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    private SelenideElement EMAIL_FIELD = $x("//*[@id='name']");
    private SelenideElement PASSWORD_FIELD = $x("//*[@id='password']");
    private SelenideElement LOGIN_BUTTON = $x("//*[@id='button_primary']");
    private SelenideElement ERROR_MESSAGE = $x("//div[@class='loginpage-message-image loginpage-message ']");

    public LoginPage() {
        super();
    }

    public LoginPage open() {
        Selenide.open(BASE_URL);
        return this;
    }

    public LoginPage LogIn(String email, String password) {
        EMAIL_FIELD.setValue(email);
        PASSWORD_FIELD.setValue(password);
        LOGIN_BUTTON.click();
        return this;
    }

    public SelenideElement getErrorMessage(String expectedText) {
        return ERROR_MESSAGE.shouldBe(visible).shouldHave(text(expectedText));
    }

}
