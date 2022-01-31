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

    @FindBy(xpath = "//*[@data-price='73.0']")
    private WebElement addToBasketButtonForBookCost73;

    @FindBy(xpath = "//*[@alt='Harry Potter and the Prisoner of Azkaban']/..")
    private WebElement linkForPageBookCost73;

    @FindBy(xpath = " descendant-or-self::*[contains(@content,'Harry Potter')]")
    private List<WebElement> generalSearchResult;

    @FindBy(xpath = "//span[@data-item-count]")
    private WebElement itemCountInBasket;

    @FindBy(xpath = "//div[@class='modal-header']//h3")
    private WebElement modalTitle;

    public int countGeneralSearchResult() {
        return generalSearchResult.size();
    }

    public BookPageCost73 navigateToBookPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(linkForPageBookCost73));
        linkForPageBookCost73.click();
        return new BookPageCost73(driver);
    }

    public SearchResultsPage addBookCost73ToBasket() {
        new BookDepositoryHomePage(driver).openPage()
                .searchForTerms("Harry Potter")
                .addToBasketButtonForBookCost73.click();
        return this;
    }

    public String getModalTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalTitle));
        return modalTitle.getText();
    }
}
