package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpilicitWait {

    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello");

        System.setProperty("webdriver.chrome.driver", "/Users/littinjomon/Downloads/chromedriver");
        // ChromeDriver driver =new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://www.ebay.com/str/halfpricebooksinc");
        Thread.sleep(5000);
        System.out.println("This test is done");
        driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java");

    }

//    public static void clickon (driver, WebElement locator,int timeout){
//        new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
//                .until(ExpectedCondition.elementToBeClickable(locator));
//        locator.click();
//    }
    }
