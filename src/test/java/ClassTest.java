import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by kpiplani on 2/16/2018.
 */
public class ClassTest {
    // Creating a new instance of the HTML unit driver
@Test
public void test1(){

    System.out.println("Test Complete ");
    FirefoxDriver driver = new FirefoxDriver ();

//        // Navigate to Google
       driver.get("https://www.google.com");
System.exit(0);
}
    // running simple test case with headless browser
//    @Test
//    public static void test() {
//        FirefoxDriver driver = new FirefoxDriver ();
//
//        // Navigate to Google
//        driver.get("https://www.google.com");
//
//        // Locate the searchbox using its name
//        WebElement element = driver.findElement(By.xpath("//*[@id='ctl00_BaseContent_tbxUserName']"));
//
//        // Enter a search query
//        element.sendKeys("Guru99");
//
//        // Submit the query. Webdriver searches for the form using the text input element automatically
//        // No need to locate/find the submit button
//        element.submit();
//
//        // This code will print the page title
//        System.out.println("Page title is: " + driver.getTitle());
//        Assert.assertEquals("Guru99 - Google Search","Guru99 - Google Search");
//        driver.quit();
//    }
}


