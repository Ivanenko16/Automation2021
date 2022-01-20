package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bookdepository.com/");
        Thread.sleep(2000);
        driver.quit();

        WebElement logo = driver.findElement(By.xpath("/html/body/div[3]/div[2]/header/div[2]/div[1]/h1/a/img"));
        WebElement signButton = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul[2]/li[3]/a"));
        WebElement icon = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul[2]/li[3]/a"));
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"book-search-form\"]/div[1]/input[1]"));
        WebElement navigationMenu = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/ul/li[1]/a[1]"));
        WebElement bannerTikTok = driver.findElement(By.xpath("/html/body/div[3]/div[5]/div[1]/div[1]/div[2]/div/div/a/img"));
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"book-search-form\"]/div[1]/button"));



    }
}

