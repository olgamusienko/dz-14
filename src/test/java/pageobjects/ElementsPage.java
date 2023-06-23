package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends AbstractPageObject {
    private final By BUTTONS_BUTTON = By.xpath("//span[text()='Buttons']");
    private final By WEB_TABLES_BUTTON = By.xpath("//span[text()='Web Tables']");

    private final String URL = "https://demoqa.com/elements";

    public ElementsPage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }
    public ButtonsPage clickButtonsButton(){
        getElement(BUTTONS_BUTTON).click();
        return new ButtonsPage(driver);
    }
    public WebTablesPage clickWebTablesButton(){
        getElement(WEB_TABLES_BUTTON).click();
        return new WebTablesPage(driver);
    }

}
