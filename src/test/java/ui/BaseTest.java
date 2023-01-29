package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected static final String BASE_URI="https://pm-eood.inv.bg";
    protected static final String EMAIL="plamen478@gmail.com";
    protected static final String PASSWORD="parola123!";
    protected static final String INV_ADDRESS="pm-eood";
    protected static final String BAD_PASSWORD="parola1234!";
    protected static final String ERROR_LOGIN_MESSAGE="Грешно потребителско име или парола. Моля, опитайте отново.  ";
    protected static final String BLANK_FIELD_MESSAGE="Моля, попълнете вашия email  ";


    @BeforeAll
    static void beforeAll(){
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void beforeEachTest(TestInfo testInfo){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(BASE_URI);
        System.out.println("Starting test"+ testInfo.getDisplayName());
    }

    @AfterEach
    void afterEachTest(){
        driver.quit();
    }


    @Test
    @Tag("login")
    @DisplayName("Can login with valid credentials")
    void canLoginWithValidCredentials(){

        WebElement enterForClients= driver.findElement(By.xpath("//a[@class='inheaderlogin selenium-front-login-button']"));
        enterForClients.click();

        WebElement loginPageHeading= driver.findElement(By.xpath("//h3"));
        Assertions.assertEquals("Вашият адрес в Inv.bg",loginPageHeading.getText());

        WebElement invAddress = driver.findElement(By.id("login-subdomain"));
        invAddress.sendKeys(INV_ADDRESS);

        WebElement enterButton= driver.findElement(By.id("gologin"));
        enterButton.click();

        WebElement emailField= driver.findElement(By.id("loginusername"));
        emailField.sendKeys(EMAIL);

        WebElement passwordField= driver.findElement(By.id("loginpassword"));
        passwordField.sendKeys(PASSWORD);

        WebElement submitButton= driver.findElement(By.cssSelector("input.selenium-submit-button"));
        submitButton.click();

        //Check that the user is logged in successfully
        WebElement userPanel= driver.findElement(By.xpath("//div[@class='userpanel-header']"));
        Assertions.assertEquals(EMAIL,userPanel.getText());

    }




}
