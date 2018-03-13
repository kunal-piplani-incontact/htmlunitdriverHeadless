import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kpiplani on 2/16/2018.
 */
public class ClassTest {
    // Creating a new instance of the HTML unit driver

    // running simple test case with headless browser
    @Test
    public static void test() throws InterruptedException {


File pathToBinary = new File("/tmp/build/673f8bf5/firefox");
FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
FirefoxProfile firefoxProfile = new FirefoxProfile();       
WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
        // Navigate to Google
       // System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
      

        // Navigate to Google
        driver.get("www.google.com");

        driver.findElement(By.id("Email")).sendKeys("Enter user name");
        driver.findElement(By.id("next")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Passwd")).sendKeys("Enter Password");
        driver.findElement(By.id("signIn")).click();
        Thread.sleep(2000);
        String title_Of_Page = driver.getTitle();
        Assert.assertEquals(driver.getTitle(), title_Of_Page);
        System.out.println("Page title matched");
    }
}


