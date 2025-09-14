package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void checkLoginWithPositiveCred() {
        loginStep.testWithPositiveCred("stasgolovnev22@gmail.com", "375333631462Stas!");
    }

    @Test
    public void checkLoginWithEmptyEmail() {
        loginStep.testWithEmptyEmail("", "375333631462Stas!");
    }

    @Test
    public void checkLoginWithEmptyPassword() {
        loginStep.testWithEmptyPassword("stasgolovnev22@gmail.com", "");
    }

    @Test
    public void checkLoginWithTestCred() {
        loginStep.testWithTestCreds("test", "test1");
    }

    @Test
    public void checkKeepingOfAuth() {
        loginStep.testKeepAuth("stasgolovnev22@gmail.com", "375333631462Stas!");
    }

}
