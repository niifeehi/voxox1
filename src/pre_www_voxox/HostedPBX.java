package pre_www_voxox;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;




//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;
//import org.junit.*;
//import static org.junit.Assert.*;




//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class HostedPBX  {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
  public void beforeClass() {
    baseUrl = "http://pre.www.voxox.com/";
    System.setProperty("webdriver.chrome.driver", "C:/Selenium/ALLJARs/webdriver/selenium-2.39.0/chromedriver.exe");
    driver = new ChromeDriver();  
  }

  @Test
  public void C37903() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Hosted PBX")).click();
    driver.findElement(By.linkText("Get a Quote!")).click();
  }
  
  @Test
  public void C37905() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Hosted PBX")).click();
    driver.findElement(By.linkText("Competitive per minute metered or unlimited plans available")).click();
  }
  
  @Test
  public void C37907() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Hosted PBX")).click();
    // driver.findElement(By.linkText("Must be combined with metered or unlimited SIP Trunks")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div/article[3]/div[2]/a")).click();
  }
  
  @Test
  public void C37909() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Hosted PBX")).click();
    driver.findElement(By.linkText("Phones and Hardware")).click();
  }
  
  @Test
  public void C37910() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.linkText("Hosted PBX")).click();
    driver.findElement(By.linkText("Add-On Features")).click();
  }
  
  

  @AfterClass
  public void afterClass()  {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      //fail(verificationErrorString);
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
