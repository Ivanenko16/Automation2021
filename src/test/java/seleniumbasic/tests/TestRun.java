package seleniumbasic.tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumbasic.pages.BookDepositoryHomePage;
import seleniumbasic.pages.PaymentDetailsPage;
import seleniumbasic.pages.YourBasketPage;

public class TestRun {

    private WebDriver driver;
    private static final String TOTAL = "53,45 €";
    private static final String SUB_TOTAL = "53,45 €";
    private static final String VAT = "0,00 €";
    private static final String BOOK_NAME = "Harry Potter";
    private static final String EMAIL = "test@user.com";

    @Before
    public void browserSetup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Verify: Total, Sub-total, Vat")
    public void reviewTotalSubTotalVat() {
        YourBasketPage yourBasketPage = new BookDepositoryHomePage(driver)
                .openPage()
                .searchForTerms(BOOK_NAME)
                .addBookToBasket()
                .navigateToYourBasketPage();

        Assert.assertEquals(TOTAL, yourBasketPage.getTotal());

        PaymentDetailsPage paymentDetailsPage = yourBasketPage.navigateToPaymentDetailsPage();
        paymentDetailsPage.fillEmailField(EMAIL);

        SoftAssertions assertionsPaymentDetailsPage = new SoftAssertions();

        assertionsPaymentDetailsPage.assertThat(paymentDetailsPage.getDataFromEmailField()).as("Email is incorrect").isEqualTo(EMAIL);
        assertionsPaymentDetailsPage.assertThat(paymentDetailsPage.getTotal()).as("Total is incorrect").isEqualTo(TOTAL);
        assertionsPaymentDetailsPage.assertThat(paymentDetailsPage.getSubTotal()).as("SubTotal is incorrect").isEqualTo(SUB_TOTAL);
        assertionsPaymentDetailsPage.assertThat(paymentDetailsPage.getVat()).as("Vat is incorrect").isEqualTo(VAT);

        assertionsPaymentDetailsPage.assertAll();
    }

    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
