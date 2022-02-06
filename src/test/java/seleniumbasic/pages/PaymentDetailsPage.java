package seleniumbasic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentDetailsPage {
    private final WebDriver driver;

    public PaymentDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "emailAddress")
    WebElement emailField;

    @FindBy(xpath = "//strong[text()='Sub-total']/../following-sibling::dd")
    WebElement subTotal;

    @FindBy(xpath = "//strong[text()='Total']/../following-sibling::dd")
    WebElement total;

    @FindBy(xpath = "//strong[text()='VAT']/../following-sibling::dd")
    WebElement vat;

    public PaymentDetailsPage fillEmailField(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(emailField));
        emailField.click();
        emailField.sendKeys(email);
        return new PaymentDetailsPage(driver);
    }

    public String getDataFromEmailField() {
        return emailField.getAttribute("value");
    }

    public String getTotal() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(total));
        return total.getText();
    }

    public String getSubTotal() {
        return subTotal.getText();
    }

    public String getVat() {
        return vat.getText();
    }
}
