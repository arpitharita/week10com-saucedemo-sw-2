package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String BaseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp()
    {
        openBrowser(BaseUrl);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValid(){

        //* Enter “standard_user” username
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        //* Enter “secret_sauce” password
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        //* Click on ‘LOGIN’ button
        WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
        Login.click();

        //* Verify the text “PRODUCTS”
        WebElement VerifyTest = driver.findElement(By.xpath("//span[@class='title']"));
        String actualTest = VerifyTest.getText();
        String expectedTest ="PRODUCTS";
        Assert.assertEquals(expectedTest,actualTest);

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){

        //* Enter “standard_user” username
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        //* Enter “secret_sauce” password
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        //* Click on ‘LOGIN’ button
        WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
        Login.click();

        //* Verify that six products are displayed on page
        WebElement VerifyTest = driver.findElement(By.xpath("//div[@class='inventory_list']"));
        VerifyTest.getText();
    }
     @After
     public void closebrowser(){
    //    driver.quit();
     }

}
