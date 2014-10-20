package qa_www_voxox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;

//import org.junit.*;
//import static org.junit.Assert.*;


//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class OutboundRatesTable {
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
  public void C38355() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Business Rates - Outbound")).click();
    driver.findElement(By.id("searchform")).clear();
    driver.findElement(By.id("searchform")).sendKeys("Mexico");
  }
  
  @Test
  public void C38356() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Business Rates - Outbound")).click();
    driver.findElement(By.id("searchform")).clear();
    driver.findElement(By.id("searchform")).sendKeys("880");
  }
  
  @Test
  public void C38357() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Business Rates - Outbound")).click();
    driver.findElement(By.id("searchform")).clear();
    driver.findElement(By.id("searchform")).sendKeys("+1809");
  }
  
  @Test
  public void C38358() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Business Rates - Outbound")).click();
    driver.findElement(By.id("searchform")).clear();
    driver.findElement(By.id("searchform")).sendKeys("$0.085");
  }
  
  @Test
  public void C38366() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Business Rates - Outbound")).click();
  }
  
  @Test
  public void C38360() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Business Rates - Outbound")).click();
    driver.findElement(By.xpath("//table[@id='rates-table']/tbody/tr[26]/td[3]")).click();
  }
  
  @Test
  public void C38361() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Business Rates - Outbound")).click();
    driver.findElement(By.xpath("//*[@id='rates-table']/tbody/tr[1]/td[4]/span")).click();
  }
  
  @Test
  public void C38362() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Business Rates - Outbound")).click();
    driver.findElement(By.xpath("//*[@id='rates-table']/tbody/tr[1]/td[3]")).click();
    driver.findElement(By.xpath("//*[@id='rates-table']/tbody/tr[1]/td[3]")).click();
  }
  
  @Test
  public void C38363() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Business Rates - Outbound")).click();
    driver.findElement(By.xpath("//*[@id='rates-table']/tbody/tr[1]/td[4]/span")).click();
    driver.findElement(By.xpath("//*[@id='rates-table']/tbody/tr[1]/td[4]/span")).click();
  }


  @AfterClass
  public void afterClass() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      //  fail(verificationErrorString);
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

