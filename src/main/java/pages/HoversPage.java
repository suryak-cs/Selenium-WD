package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index - Index is 1 based
     */
    public FigCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigCaption(figure.findElement(boxCaption));
    }

    public class FigCaption{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDiaplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }

    }
}
