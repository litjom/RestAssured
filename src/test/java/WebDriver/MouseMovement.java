package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseMovement {


    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello");

        System.setProperty("webdriver.chrome.driver", "/Users/littinjomon/Downloads/chromedriver");
        // ChromeDriver driver =new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);
        driver.get("https://www.ebay.com/str/halfpricebooksinc");
        Thread.sleep(5000);
        System.out.println("This test is done");
        driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java");

        Actions action =new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("About us"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Fleet")).click();

    }
}
