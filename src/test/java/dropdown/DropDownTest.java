package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {

    @Test(groups = {"Sanity"})
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();
        String option1 = "Option 1";
        dropDownPage.selectFromDropDown(option1);
        var selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1, "Incorrect number of selection");
        assertTrue(selectedOptions.contains(option1), "Option not selected");
    }
}
