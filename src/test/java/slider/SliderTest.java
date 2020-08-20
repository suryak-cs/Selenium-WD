package slider;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SliderTest extends BaseTest {
    @Test
    public void dragSliderRight(){
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.dragSlider(3.5);
        assertEquals(sliderPage.getSliderText(), "3.5", "Incorrect slider text");
    }
}
