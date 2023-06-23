package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.*;

public class WebTablesPage extends AbstractPageObject {
    private final By ADD_BUTTON = By.xpath("//button[text()='Add']");
    private final By FIRST_NAME_FIELD = By.cssSelector("#firstName");
    private final By LAST_NAME_FIELD = By.cssSelector("#lastName");
    private final By EMAIL_FIELD = By.cssSelector("#userEmail");
    private final By AGE_FIELD = By.cssSelector("#age");
    private final By SALARY_FIELD = By.cssSelector("#salary");
    private final By DEPARTMENT_FIELD = By.cssSelector("#department");
    private final By SUBMIT_BUTTON = By.cssSelector("#submit");
    private final By EDIT_BUTTON = By.cssSelector("#edit-record-4");


    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    @Step("A user opens Registration form")
    public void openRegistrationForm(){
        getElement(ADD_BUTTON).click();
    }
    @Step("A user fills the form")
    public WebTablesPage fillForm(String firstName, String lastName, String email,String age, String salary, String department){
        WebElement firstNameField = getElement(FIRST_NAME_FIELD);
        WebElement lastNameField = getElement(LAST_NAME_FIELD);
        WebElement emailField = getElement(EMAIL_FIELD);
        WebElement ageField = getElement(AGE_FIELD);
        WebElement salaryField = getElement(SALARY_FIELD);
        WebElement departmentField = getElement(DEPARTMENT_FIELD);
        WebElement submitButton = getElement(SUBMIT_BUTTON);


        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
        emailField.clear();
        emailField.sendKeys(email);
        ageField.clear();
        ageField.sendKeys(age);
        salaryField.clear();
        salaryField.sendKeys(salary);
        departmentField.clear();
        departmentField.sendKeys(department);
        submitButton.click();
        return new WebTablesPage(driver);
    }
    public boolean checkRowExists(String email) {
        By emailPath = By.xpath(String.format("//div[text()='%s']", email));
        try {
            getElement(emailPath);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    public void openEditForm(){
        getElement(EDIT_BUTTON).click();
    }



}
