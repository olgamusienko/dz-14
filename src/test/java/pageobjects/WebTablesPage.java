package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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


    public void openRegistrationForm(){
        getElement(ADD_BUTTON).click();
    }
    public WebTablesPage fillForm(String firstName, String lastName, String email,String age, String salary, String department){
        WebElement firstNameField = getElement(FIRST_NAME_FIELD, 4);
        WebElement lastNameField = getElement(LAST_NAME_FIELD, 4);
        WebElement emailField = getElement(EMAIL_FIELD, 4);
        WebElement ageField = getElement(AGE_FIELD, 4);
        WebElement salaryField = getElement(SALARY_FIELD, 4);
        WebElement departmentField = getElement(DEPARTMENT_FIELD, 4);
        WebElement submitButton = getElement(SUBMIT_BUTTON, 4);


        firstNameField.clear();
        lastNameField.clear();
        emailField.clear();
        ageField.clear();
        salaryField.clear();
        departmentField.clear();

        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        ageField.sendKeys(age);
        salaryField.sendKeys(salary);
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
