package seleniumbasic.tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.After;
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
    private static final String TOTAL = "52,99 €";
    private static final String SUB_TOTAL = "52,99 €";
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

        SoftAssertions assertionsYourBasketPage = new SoftAssertions();
        assertionsYourBasketPage.assertThat(yourBasketPage.getTotal()).isEqualTo(TOTAL);

        PaymentDetailsPage paymentDetailsPage = yourBasketPage.navigateToPaymentDetailsPage();
        paymentDetailsPage.fillEmailField(EMAIL);

        SoftAssertions assertionsPaymentDetailsPage = new SoftAssertions();

        assertionsPaymentDetailsPage.assertThat(paymentDetailsPage.getDataFromEmailField()).isEqualTo(EMAIL);
        assertionsPaymentDetailsPage.assertThat(paymentDetailsPage.getTotal()).isEqualTo(TOTAL);
        assertionsPaymentDetailsPage.assertThat(paymentDetailsPage.getSubTotal()).isEqualTo(SUB_TOTAL);
        assertionsPaymentDetailsPage.assertThat(paymentDetailsPage.getVat()).isEqualTo(VAT);

        assertionsPaymentDetailsPage.assertAll();
    }

    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
