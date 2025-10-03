package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.base.BasePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static elements.LoginPageElements.*;

public class LoginPage extends BasePage {

    public LoginPage() {
        super();
    }

    @Step("Открытие страницы авторизации")
    public LoginPage open() {
        logger.info("Открытие страницы авторизации");
        Selenide.open(BASE_URL);
        return this;
    }

    @Step("Авторизация с именем '{user}' и паролем '{password}'")
    public LoginPage logIn(String user, String password) {
        logger.info("Вход на страницы авторизации");
        EMAIL_FIELD.setValue(user);
        PASSWORD_FIELD.setValue(password);
        LOGIN_BUTTON.click();
        return this;
    }

    @Step("Получение ошибки '{expectedText}'")
    public SelenideElement getErrorMessage(String expectedText) {
        logger.info("Получение ошибки");
        return ERROR_MESSAGE.shouldBe(visible).shouldHave(text(expectedText));
    }
}
