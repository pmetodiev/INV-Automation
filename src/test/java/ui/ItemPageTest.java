package ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemPageTest extends BaseTest {

    private static final String ITEM_HEADING= "Артикули";
    private static final String NO_ITEMS_MESSAGE= "Все още нямате добавени артикули.";

    @Test
    @Tag("items")
    @DisplayName("Can navigate to item page")
    void canNavigateToItemPage(){
        canLoginWithValidCredentials();

        WebElement itemMenuLink=driver.findElement(By.id("tabs_objects"));
        itemMenuLink.click();

        WebElement itemHeading=driver.findElement(By.xpath("//div[@id='headline2']/h2"));
        Assertions.assertEquals(ITEM_HEADING,itemHeading.getText());
    }

    @Test
    @DisplayName("No items in the list")
    void noItemsInTheList(){
        canLoginWithValidCredentials();
        WebElement itemMenuLink=driver.findElement(By.id("tabs_objects"));
        itemMenuLink.click();
        WebElement emptyList=driver.findElement(By.xpath("//div[@id='emptylist']"));
        Assertions.assertEquals(NO_ITEMS_MESSAGE,emptyList.getText());
    }







}
