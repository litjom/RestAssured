package WebDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.nio.file.Files;

public class ScreenShot {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello");

        System.setProperty("webdriver.chrome.driver", "/Users/littinjomon/Downloads/chromedriver");
        // ChromeDriver driver =new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://www.ebay.com/str/halfpricebooksinc");
        Thread.sleep(5000);
        System.out.println("This test is done");
//Files src =(TakesScreenshot)driver).driver.getScreenshotAs(OutputType.FILE);
     //   FileUtils.copyFile(src,new File("/Users/littinjomon/IdeaProjects/Selenium-Jenkins/src/test/java/WebDriver/google.png"));

    }
}
