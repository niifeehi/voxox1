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

public class ContactUsPage {
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
  public void C37539() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop2")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.linkText("Email Assist")).click();
  }
  
  @Test
  public void C37540() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop2")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.linkText("Email Support")).click();
  }
  
  @Test
  public void C37541() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop2")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/div/div/div[2]/ul[1]/li[3]/a")).click();
   
  }
  
  @Test
  public void C37542() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop2")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.linkText("Email Sales")).click();
  }
  
  @Test
  public void C37543() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop2")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.linkText("Email Partners")).click();
  }
  
  @Test
  public void C37544() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop2")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.linkText("Email Operators")).click();
  }
  
  @Test
  public void C37545() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop2")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.linkText("Email Billing")).click();
  }
  
  @Test
  public void C37546() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop2")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.linkText("Email Press")).click();
  }
  
  @Test
  public void C37547() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop2")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.linkText("Email Investors")).click();
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
