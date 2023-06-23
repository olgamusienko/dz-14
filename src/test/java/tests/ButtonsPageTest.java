package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;
import pageobjects.ElementsPage;

public class ButtonsPageTest extends BaseTest{

    @Test
    public void testButtonsPagePositive(){
        ElementsPage elementsPage = new ElementsPage(driver);
        ButtonsPage buttonsPage = elementsPage.clickButtonsButton();
        buttonsPage.clickClickMeButton();
        String message = buttonsPage.getMessage();
        Assert.assertEquals(message,"You have done a dynamic click", "The message is wrong");
    }


}
