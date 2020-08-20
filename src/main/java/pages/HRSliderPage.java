package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HRSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By sliderText = By.cssSelector(".sliderContainer #range");
    public HRSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragSlider(double val){
        double unit = 0.0;
        while(unit<val){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
            unit+=0.5;
        }
    }
    public String getSliderText(){
        return driver.findElement(sliderText).getText();
    }
}
