package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import elements.LoginPageElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static elements.LoginPageElements.*;

public class LoginPage extends BasePage {



    public LoginPage() {
        super();
    }

    public LoginPage open() {
        Selenide.open(BASE_URL);
        return this;
    }

    public LoginPage logIn(String user, String password) {
        EMAIL_FIELD.setValue(user);
        PASSWORD_FIELD.setValue(password);
        LOGIN_BUTTON.click();
        return this;
    }

    public SelenideElement getErrorMessage(String expectedText) {
        return ERROR_MESSAGE.shouldBe(visible).shouldHave(text(expectedText));
    }
}
