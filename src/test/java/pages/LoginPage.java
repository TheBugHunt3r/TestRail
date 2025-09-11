package pages;

import com.codeborne.selenide.Selenide;
import dto.Account;
import tests.BaseTest;
import wrappers.Input;
import wrappers.Picklist;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BaseTest {

    /*private final String FIRST_NAME = "//*[@id='first_name']";
    private final String LAST_NAME = "//*[@id='last_name']";
    private final String WORK_EMAIL = "//*[@id='email']";
    private final String WORK_EMAIL = "//*[@id='phone']";
    private final String COMPANY_NAME = "//*[@id='organization']";
    private final String COUNTRY = "//*[@id='last_name']";
    private final String EXPECTED_USERS = "//*[@id='last_name']";
    private final String WEB_ADDRESS = "//*[@id='last_name']";
    private final String CREATE_ACCOUNT_BUTTON = "//*[@id='last_name']";*/

    public LoginPage open() {
        Selenide.open("https://secure.testrail.com/customers/testrail/trial/?type=signup");
        return this;
    }

    public LoginPage createAccount() {
        Account account = Account.builder()
                .first_name("First Name")
                .last_name("Last Name")
                .email("Work Email")
                .phone("Phone Number")
                .company("Company name")
                .country("Country")
                .expected_users("How many users do you expect to access TestRail?")
                .web_address("Web Address")
                .build();
        return this;
    }

    public LoginPage createAccount(Account account) {
        new Input("First Name").write(account.getFirst_name());
        new Input("Last Name").write(account.getLast_name());
        new Input("Work Email").write(account.getEmail());
        new Input("Phone Number").write(account.getPhone());
        new Input("Company name").write(account.getCompany());
        new Picklist("Country").select("China");
        new Picklist("How many users do you expect to access TestRail?").select("1");
        new Input("Web Address").write(account.getWeb_address());
        return this;
    }

    public LoginPage clickCreateAccountButton() {
        $x("//button[@type='submit']").click();
        return this;
    }
}
