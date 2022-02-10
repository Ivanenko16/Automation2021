package seleniumbasic.tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumbasic.pages.BookDepositoryHomePage;
import seleniumbasic.pages.PaymentDetailsPage;

public class PaymentDetailsPageTest {

    private WebDriver driver;
    private static final String TOTAL = "53,72 €";
    private static final String SUB_TOTAL = "53,72 €";
    private static final String VAT = "0,00 €";

    @Before
    public void browserSetup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeEach
    private PaymentDetailsPage createPaymentDetailsPage() {
        return new BookDepositoryHomePage(driver)
                .openPage()
                .searchForTerms("Harry Potter")
                .addHarryPotterBookToBasket()
                .navigateToYourBasketPage()
                .navigateToPaymentDetailsPage();
    }

    @Test
    @DisplayName("The email field is filled")
    public void verifyEmailField() {
        String dataInEmailField = createPaymentDetailsPage()
                .fillEmailField("test@user.com")
                .getDataFromEmailField();

        Assert.assertEquals("test@user.com", dataInEmailField);
    }

    @Test
    @DisplayName("Review: Total, Sub-total, Vat")
    public void reviewTotalSubTotalVat() {
        PaymentDetailsPage paymentDetailsPage = createPaymentDetailsPage();
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(paymentDetailsPage.getTotal()).isEqualTo(TOTAL);
        softAssertions.assertThat(paymentDetailsPage.getSubTotal()).isEqualTo(SUB_TOTAL);
        softAssertions.assertThat(paymentDetailsPage.getVat()).isEqualTo(VAT);

        softAssertions.assertAll();
    }

    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
