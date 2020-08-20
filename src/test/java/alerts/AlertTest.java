package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJSAlert();
        alertPage.triggerAlert();
        alertPage.alert_ClickToAccept();
        assertEquals(alertPage.getResult(), "You successfuly clicked an alert", "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickJSAlert();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_ClickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputAlert(){
        var alertPage = homePage.clickJSAlert();
        alertPage.triggerPrompt();

        String inputText = "Hello, this is Suryakanta!";
        alertPage.alert_SetInput(inputText);
        alertPage.alert_ClickToAccept();
        assertEquals(alertPage.getResult(), "You entered: "+inputText, "Incorrect result message");
    }
}
