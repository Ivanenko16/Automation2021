package seleniumbasic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookDepositoryHomePage {

    private final static String HOMEPAGE_URL = "https://www.bookdepository.com/";
    private final WebDriver driver;

    public BookDepositoryHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='brand-link']")
    private WebElement logo;

    @FindBy(xpath = "//*[@class" +
            "='page-slide']//a[text()='Sign in/Join']")
    private WebElement signButton;

    @FindBy(xpath = "//*[@class='icon-wishlist']")
    private WebElement iconWishlist;

    @FindBy(name = "searchTerm")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class='header-search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@class='secondary-header-wrap ']//a[text()='Shop by category']")
    private WebElement navigationMenu;

    @FindBy(xpath = "//div[contains(text(),'TikTok')]")
    private WebElement bannerTikTok;

    public BookDepositoryHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, Duration.ofSeconds(10));
        return this;
    }

    public SearchResultsPage searchForTerms(String term) {
        searchField.sendKeys(term);
        searchButton.click();
        return new SearchResultsPage(driver);
    }

    public String getLogoName() {
        openPage();
        return logo.getAccessibleName();
    }

    public Boolean presentSignInButton() {
        openPage();
        return signButton.isDisplayed();
    }

    public Boolean presentIconWishlist() {
        openPage();
        return iconWishlist.isDisplayed();
    }
}
