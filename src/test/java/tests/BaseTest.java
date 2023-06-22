package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
        driver.manage().window().maximize();
        System.out.println("The setup process is completed");
    }
    @AfterTest
    public void cleanUp(){
        driver.close();
    }
    @AfterGroups
    public void shutDown(){
        driver.quit();
    }

}
