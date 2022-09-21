// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SignupTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void signup() {
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().setSize(new Dimension(1616, 876));
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email_create")).click();
    driver.findElement(By.id("email_create")).sendKeys("kameshvenkatesan24@gmail.com");
    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
    driver.findElement(By.cssSelector(".fancybox-item")).click();
    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".icon-lock"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("customer_firstname")).click();
    driver.findElement(By.id("customer_firstname")).sendKeys("Kamesh");
    driver.findElement(By.id("customer_lastname")).click();
    driver.findElement(By.id("customer_lastname")).sendKeys("v");
    driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).sendKeys("12345");
    driver.findElement(By.id("address1")).click();
    driver.findElement(By.id("address1")).sendKeys("11 chennai");
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("city")).sendKeys("chennai");
    driver.findElement(By.id("id_state")).click();
    {
      WebElement dropdown = driver.findElement(By.id("id_state"));
      dropdown.findElement(By.xpath("//option[. = 'Alaska']")).click();
    }
    driver.findElement(By.id("postcode")).click();
    driver.findElement(By.id("postcode")).sendKeys("60000");
    driver.findElement(By.id("phone_mobile")).click();
    driver.findElement(By.id("phone_mobile")).sendKeys("3216549878");
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.id("alias")).sendKeys("My address chennai");
    driver.findElement(By.cssSelector("#submitAccount > span")).click();
    driver.findElement(By.linkText("Sign out")).click();
  }
}
