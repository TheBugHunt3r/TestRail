package tests.ui;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void checkLoginWithPositiveCred() {
        loginStep.testWithPositiveCred(user, password);
    }

    @Test
    public void checkLoginWithEmptyEmail() {
        loginStep.testWithEmptyEmail("", password);
    }

    @Test
    public void checkLoginWithEmptyPassword() {
        loginStep.testWithEmptyPassword(user, "");
    }

    @Test
    public void checkLoginWithTestCred() {
        loginStep.testWithTestCreds("test", "test1");
    }

    @Test
    public void checkKeepingOfAuth() {
        loginStep.testKeepAuth(user, password);
    }

}
