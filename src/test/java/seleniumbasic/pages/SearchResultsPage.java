package seleniumbasic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage {

    private final WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-isbn='9781408845660']")
    private WebElement addToBasketHarryPotterAndThePrisonerOfAzkaban;

    @FindBy(xpath = "//*[@alt='Harry Potter and the Prisoner of Azkaban']/..")
    private WebElement linkForHarryPotterPageBook;

    @FindBy(xpath = " descendant-or-self::*[contains(@content,'Harry Potter')]")
    private List<WebElement> generalSearchResult;

    @FindBy(xpath = "//span[@data-item-count]")
    private WebElement itemCountInBasket;

    @FindBy(xpath = "//div[@class='modal-header']//h3")
    private WebElement modalTitle;

    @FindBy(xpath = "//a[text()='Basket / Checkout']")
    private WebElement basketCheckoutButton;

    public int countGeneralSearchResult() {
        return generalSearchResult.size();
    }

    public HarryPotterBookPage navigateToHarryPotterBookPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(linkForHarryPotterPageBook));
        linkForHarryPotterPageBook.click();
        return new HarryPotterBookPage(driver);
    }

    public SearchResultsPage addHarryPotterBookToBasket() {
        new SearchResultsPage(driver)
                .addToBasketHarryPotterAndThePrisonerOfAzkaban.click();
        return this;
    }

    public String getModalTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalTitle));
        return modalTitle.getText();
    }

    public YourBasketPage navigateToYourBasketPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(basketCheckoutButton));
        basketCheckoutButton.click();
        return new YourBasketPage(driver);
    }
}
