package seleniumbasic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YourBasketPage {
    private final WebDriver driver;

    public YourBasketPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//dd[text()='53,72 €']")
    WebElement total;

    @FindBy(xpath = "//a[@class='checkout-btn btn optimizely-variation-1 original-bucket']")
    WebElement checkoutButton;

    public String getTotal() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(total));
        return total.getText();
    }

    public PaymentDetailsPage navigateToPaymentDetailsPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(checkoutButton));
        checkoutButton.click();
        return new PaymentDetailsPage(driver);
    }
}

