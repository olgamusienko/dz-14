package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ElementsPage;
import pageobjects.WebTablesPage;

public class WebTablesPageTest extends BaseTest{


    @Test
    public void testWebTablesPagePositive(){
        System.out.println("The testWebTablesPage process is in progress");
        ElementsPage elementsPage = new ElementsPage(driver);
        WebTablesPage webTablesPage = elementsPage.clickWebTablesButton();
        webTablesPage.openRegistrationForm();
        webTablesPage.fillForm("Alex", "Brown", "alex.b@gmail.com", "35","4500", "ABC");

        Assert.assertTrue(webTablesPage.checkRowExists("alex.b@gmail.com"));

        webTablesPage.openEditForm();
        webTablesPage.fillForm("Alexander", "Brown", "alexander.b@gmail.com", "35","6500", "ABCD");

        Assert.assertTrue(webTablesPage.checkRowExists("alexander.b@gmail.com"));


    }

}
