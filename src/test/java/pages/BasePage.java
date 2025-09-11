package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public final String BASE_URL = "https://saucedemo111234555.testrail.io/index.php?/auth/login/LWZhMDA0NWExYzgyM2Uy" +
            "NWUzMDVjMjE3ZmRjNzU1ZWEzMjJkOTZmNWY1MWEwODk0MDNjZDJhN2E1NTQ2YTEzM2Y:";

    public BasePage() {
    }
}
