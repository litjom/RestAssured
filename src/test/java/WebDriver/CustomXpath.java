package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello");

        System.setProperty("webdriver.chrome.driver","/Users/littinjomon/Downloads/chromedriver");
        // ChromeDriver driver =new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://www.ebay.com/str/halfpricebooksinc");
        Thread.sleep(5000);
        System.out.println("This test is done");
driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java");


//dynamic xpath
        //id=test_123
        //id=test_21312
        //id=test_869    here test_ is common and rest is dynamic
        //driver.findElement(By.xpath("//input[start-with(@id,'test_')]")).sendKeys("java");


        //id = 1234_test_t
        //id=5435_test_t
        //driver.findElement(By.xpath("//input[ends-with(@id,'test_t')]")).sendKeys("java");


        //Contain Text
        //driver.findElement(By.xpath("//input[contains(text(),'Pokemon')]")).sendKeys("java");

        driver.quit();
    }



}
