package seleniumbasic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HarryPotterBookPage {

    public HarryPotterBookPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1")
    WebElement bookTitle;

    public String getBookTitle() {
        return bookTitle.getText();
    }
}
