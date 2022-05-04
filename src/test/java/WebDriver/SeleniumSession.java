package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSession {


    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello");

        System.setProperty("webdriver.chrome.driver","/Users/littinjomon/Downloads/chromedriver");
       // ChromeDriver driver =new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
driver.get("https://www.ebay.com/str/halfpricebooksinc");
Thread.sleep(5000);
System.out.println("This test is done");

driver.navigate().to("https://www.bankofamerica.com/");

driver.quit();
    }
}
