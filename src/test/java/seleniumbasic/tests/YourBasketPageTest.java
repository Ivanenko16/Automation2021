package seleniumbasic.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumbasic.pages.BookDepositoryHomePage;

public class YourBasketPageTest {

    private WebDriver driver;

    @Before
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Verify total on the basket")
    public void totalOnTheBasket() {
        String total = new BookDepositoryHomePage(driver)
                .openPage()
                .searchForTerms("Harry Potter")
                .addHarryPotterBookToBasket()
                .navigateToYourBasketPage()
                .getTotal();

        Assert.assertEquals("53,72 €", total);
    }

    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
