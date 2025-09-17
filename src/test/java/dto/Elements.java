package dto;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Elements {

    public static SelenideElement ADD_PROJECT_BUTTON = $x("//button[@data-testid='addEditProjectAddButton']");
}
