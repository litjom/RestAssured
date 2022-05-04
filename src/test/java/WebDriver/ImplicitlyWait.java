package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello");

        System.setProperty("webdriver.chrome.driver", "/Users/littinjomon/Downloads/chromedriver");
        // ChromeDriver driver =new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //Dynamic - if page is loaded in 2 secs, rest will be ignored
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //Dynamic - This will wait for 30 seconds after the page is loaded-
        // if all the element is found within 2 sec rest will be ignored
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.get("https://www.ebay.com/str/halfpricebooksinc");
        Thread.sleep(5000);
        System.out.println("This test is done");
    }

}
