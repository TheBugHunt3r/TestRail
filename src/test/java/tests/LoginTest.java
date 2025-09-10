package tests;

import dto.Account;
import dto.AccountFactory;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void checkCreateAccount() throws InterruptedException {
        Account account = AccountFactory.getAccount("France", "1");
        loginStep.createAccount(account);
    }
}
