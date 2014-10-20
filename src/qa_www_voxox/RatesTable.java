package qa_www_voxox;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;



//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;


//import org.junit.*;
import static org.junit.Assert.*;

//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class RatesTable {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
  public void beforeClass() {
    baseUrl = "http://qa.www.voxox.com/";
    System.setProperty("webdriver.chrome.driver", "C:/Selenium/ALLJARs/webdriver/selenium-2.39.0/chromedriver.exe");
    driver = new ChromeDriver();  
  }

  @Test
  public void C39235() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("Calling Rates")).click();
    driver.findElement(By.id("searchform")).clear();
    driver.findElement(By.id("searchform")).sendKeys("Mexico");
  }
  
  @Test
  public void C39236() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='drop3']")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[4]/a")).click();
    // driver.findElement(By.id("drop3")).click();
    // driver.findElement(By.linkText("Calling Rastes")).click();
    driver.findElement(By.id("searchform")).clear();
    driver.findElement(By.id("searchform")).sendKeys("+1809");
  }
  
  @Test
  public void C39237() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='drop3']")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[4]/a")).click();
    // driver.findElement(By.id("drop3")).click();
    // driver.findElement(By.linkText("Calling Rastes")).click();
    driver.findElement(By.id("searchform")).clear();
    driver.findElement(By.id("searchform")).sendKeys("+1809");
  }
  
  @Test
  public void C39238() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='drop3']")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[4]/a")).click();
    // driver.findElement(By.id("drop3")).click();
    // driver.findElement(By.linkText("Calling Rastes")).click();
    driver.findElement(By.id("searchform")).clear();
    driver.findElement(By.id("searchform")).sendKeys("$0.149");
  }
  
  @Test
  public void C39239() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='drop3']")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[4]/a")).click();
    // driver.findElement(By.id("drop3")).click();
    // driver.findElement(By.linkText("Calling Rastes")).click();
    driver.findElement(By.id("searchform")).clear();
    driver.findElement(By.id("searchform")).sendKeys("12");
  }
  
  @Test
  public void C39240() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='drop3']")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[4]/a")).click();
  
  }
  
  @Test
  public void C39241() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='drop3']")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[4]/a")).click();
    driver.findElement(By.xpath("//*[@id='rates-table']/tbody/tr[15]/td[3]")).click();
  }
  
  
  @Test
  public void C39242() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='drop3']")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[4]/a")).click();
    driver.findElement(By.xpath("//*[@id='rates-table']/tbody/tr[16]/td[4]/span")).click();
  }
  
  @Test
  public void C39243() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("Calling Rates")).click();
    driver.findElement(By.xpath("//table[@id='rates-table']/tbody/tr[16]/td[4]/span")).click();
    driver.findElement(By.xpath("//table[@id='rates-table']/tbody/tr[16]/td[4]/span")).click();
  }
  
  @Test
  public void C39244() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("Calling Rates")).click();
    driver.findElement(By.xpath("//table[@id='rates-table']/tbody/tr[16]/td[4]/span")).click();
    driver.findElement(By.xpath("//table[@id='rates-table']/tbody/tr[16]/td[4]/span")).click();
    driver.findElement(By.xpath("//table[@id='rates-table']/tbody/tr[16]/td[4]/span")).click();
  }
  

  @AfterClass
  public void afterClass() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  @SuppressWarnings("unused")
private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  @SuppressWarnings("unused")
private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  @SuppressWarnings("unused")
private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

