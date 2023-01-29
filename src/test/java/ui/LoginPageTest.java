package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPageTest extends BaseTest {






//    @Test
//    @Tag("login")
//    @DisplayName("Cant login with invalid credentials")
//    void cantLoginWithInvalidCredentials(){
//
//        WebElement enterForClients= driver.findElement(By.xpath("//a[@class='inheaderlogin selenium-front-login-button']"));
//        enterForClients.click();
//
//        WebElement loginPageHeading= driver.findElement(By.xpath("//h3"));
//        Assertions.assertEquals("Вашият адрес в Inv.bg",loginPageHeading.getText());
//
//        WebElement invAddress = driver.findElement(By.id("login-subdomain"));
//        invAddress.sendKeys(INV_ADDRESS);
//
//        WebElement enterButton= driver.findElement(By.id("gologin"));
//        enterButton.click();
//
//        WebElement emailField= driver.findElement(By.id("loginusername"));
//        emailField.sendKeys(EMAIL);
//
//        WebElement passwordField= driver.findElement(By.id("loginpassword"));
//        passwordField.sendKeys(BAD_PASSWORD);
//
//        WebElement submitButton= driver.findElement(By.cssSelector("input.selenium-submit-button"));
//        submitButton.click();
//
//        //Check that the user is logged in successfully
//        WebElement errorLoginMessage=driver.findElement(By.xpath("//div[@class='selenium-error-block']"));
//        Assertions.assertEquals(ERROR_LOGIN_MESSAGE,errorLoginMessage.getText());
//
//    }
//
//    @Test
//    @Tag("login")
//    @DisplayName("Cant login with blank fields")
//    void cantLoginWithBlankFields(){
//
//        WebElement enterForClients= driver.findElement(By.xpath("//a[@class='inheaderlogin selenium-front-login-button']"));
//        enterForClients.click();
//
//        WebElement loginPageHeading= driver.findElement(By.xpath("//h3"));
//        Assertions.assertEquals("Вашият адрес в Inv.bg",loginPageHeading.getText());
//
//        WebElement invAddress = driver.findElement(By.id("login-subdomain"));
//        invAddress.sendKeys(INV_ADDRESS);
//
//        WebElement enterButton= driver.findElement(By.id("gologin"));
//        enterButton.click();
//
////        WebElement emailField= driver.findElement(By.id("loginusername"));
////        emailField.sendKeys(EMAIL);
////
////        WebElement passwordField= driver.findElement(By.id("loginpassword"));
////        passwordField.sendKeys(BAD_PASSWORD);
//
//        WebElement submitButton= driver.findElement(By.cssSelector("input.selenium-submit-button"));
//        submitButton.click();
//
//        //Check that the user is logged in successfully
//        WebElement blankFieldMessage=driver.findElement(By.xpath("//div[@class='selenium-error-block']"));
//        Assertions.assertEquals(BLANK_FIELD_MESSAGE,blankFieldMessage.getText());
//
//    }
//
//    @Test
//    @Tag("login")
//    @DisplayName(" Can login and log out with valid credentials")
//    void logInAndLogOutWithValidCredentials(){
//
//        WebElement enterForClients= driver.findElement(By.xpath("//a[@class='inheaderlogin selenium-front-login-button']"));
//        enterForClients.click();
//
//        WebElement loginPageHeading= driver.findElement(By.xpath("//h3"));
//        Assertions.assertEquals("Вашият адрес в Inv.bg",loginPageHeading.getText());
//
//        WebElement invAddress = driver.findElement(By.id("login-subdomain"));
//        invAddress.sendKeys(INV_ADDRESS);
//
//        WebElement enterButton= driver.findElement(By.id("gologin"));
//        enterButton.click();
//
//        WebElement emailField= driver.findElement(By.id("loginusername"));
//        emailField.sendKeys(EMAIL);
//
//        WebElement passwordField= driver.findElement(By.id("loginpassword"));
//        passwordField.sendKeys(PASSWORD);
//
//        WebElement submitButton= driver.findElement(By.cssSelector("input.selenium-submit-button"));
//        submitButton.click();
//
//        WebElement userPanel=driver.findElement(By.id("userpanel"));
//        userPanel.click();
//
//        WebElement logout=driver.findElement(By.xpath("//a[@class='selenium-button-logout button-logout']"));
//        logout.click();
//
//        //Check that the user is logged in successfully
//        WebElement logOutSuccessfullyMessage =driver.findElement(By.id("okmsg"));
//        Assertions.assertEquals("Вие излязохте от акаунта си. ",logOutSuccessfullyMessage.getText());
//
//        WebElement companyName =driver.findElement(By.id("wellcome"));
//        Assertions.assertEquals("pm",companyName.getText());
//
//
//    }





}
