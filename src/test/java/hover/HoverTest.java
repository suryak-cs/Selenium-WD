package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends BaseTest {
    @Test
    public void testHoverUser1(){
        var hoverPage = homePage.clickHovers();
        var caption = hoverPage.hoverOverFigure(2);
        assertTrue(caption.isCaptionDiaplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user2","Caption title incorrect");
        assertEquals(caption.getLinkText(),"View profile","Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/2"),"Link incorrect");
    }
}
