package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class How_many_Links_Availabe_also_text {


    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello");

        System.setProperty("webdriver.chrome.driver","/Users/littinjomon/Downloads/chromedriver");
        // ChromeDriver driver =new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://www.ebay.com/str/halfpricebooksinc");
        Thread.sleep(5000);
        System.out.println("This test is done");

     List<WebElement> linkedlist = driver.findElements(By.tagName("a"));
     System.out.println(linkedlist.size());
        for (int i=1;i<=linkedlist.size();i++)
        {
    String linktest = linkedlist.get(i).getText();
    System.out.println(linktest);
        }

        driver.quit();
    }
}
