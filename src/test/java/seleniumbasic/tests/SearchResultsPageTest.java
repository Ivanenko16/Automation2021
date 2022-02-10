package seleniumbasic.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumbasic.pages.BookDepositoryHomePage;

public class SearchResultsPageTest {

    private WebDriver driver;

    @Before
    public void browserSetup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Open the bookPage")
    public void HarryPotterBookPageIsOpened() {
        String bookTitle = new BookDepositoryHomePage(driver)
                .openPage()
                .searchForTerms("Harry Potter")
                .navigateToBookPage()
                .getBookTitle();

        Assert.assertEquals("Harry Potter and the Prisoner of Azkaban", bookTitle);
    }

    @Test
    @DisplayName("Verify that book is added to the basket")
    public void bookIsAddedToTheBasket() {
        String modalTitle = new BookDepositoryHomePage(driver)
                .openPage()
                .searchForTerms("Harry Potter")
                .addBookToBasket()
                .getModalTitle();

        Assert.assertEquals("Item added to your basket", modalTitle);
    }

    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
