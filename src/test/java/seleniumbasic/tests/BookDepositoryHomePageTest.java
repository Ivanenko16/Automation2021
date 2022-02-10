package seleniumbasic.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumbasic.pages.BookDepositoryHomePage;

public class BookDepositoryHomePageTest {

    private WebDriver driver;

    @Before
    public void browserSetup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Keyword search check")
    public void commonSearchTermResultsAreNotEmpty() {
        int expectedSearchResultNumber = new BookDepositoryHomePage(driver)
                .openPage()
                .searchForTerms("Harry Potter")
                .countGeneralSearchResult();

        Assert.assertTrue("Book with a title containing the search phrase is not present", expectedSearchResultNumber > 0);
    }

    @Test
    @DisplayName("Logo name check")
    public void checkLogoName() {
        String logoName = new BookDepositoryHomePage(driver)
                .openPage()
                .getLogoName();

        Assert.assertEquals(logoName, "Bookdepository.com");
    }

    @Test
    @DisplayName("Sign In button is visible")
    public void signInButtonIsVisible() {
        boolean signInButtonIsVisible = new BookDepositoryHomePage(driver)
                .openPage()
                .presentSignInButton();

        Assert.assertTrue(signInButtonIsVisible);
    }

    @Test
    @DisplayName("Wishlist is visible")
    public void checkIconWishlistName() {
        boolean presentIconWishlist = new BookDepositoryHomePage(driver)
                .openPage()
                .presentIconWishlist();

        Assert.assertTrue(presentIconWishlist);
    }

    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
