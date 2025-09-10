package steps;

import dto.Account;
import pages.LoginPage;

public class LoginStep {

    LoginPage loginPage;

    public LoginStep() {
        loginPage = new LoginPage();
    }

    public void createAccount(Account account) {
        loginPage.open()
                .createAccount(account)
                .clickCreateAccountButton();
    }
}
