package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {
    @Test(groups = {"Sanity"})
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().
                        contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
