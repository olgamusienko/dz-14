package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends AbstractPageObject{

    private final By clickMeButton = By.xpath("//button[text()='Click Me']");
    private final By message = By.id("dynamicClickMessage");


    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @Step("A user searches for a ClickMe button and clicks it")
    public void clickClickMeButton(){
        getElement(clickMeButton).click();
    }

    public String getMessage(){
        return getElement(message).getText();
    }
}
