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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class DownloadIOSForm {
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
  public void C37584() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Voxox IOS")).click();
    ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
    driver.findElement(By.xpath("//*[@id='main']/section/div/div[1]/a[1]")).click();
    driver.findElement(By.id("number")).clear();
    driver.findElement(By.id("number")).sendKeys("858555");
    driver.findElement(By.cssSelector("button.btn.sendsms")).click();
  }
  
  @Test
  public void C37788() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Voxox Android")).click();
    ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
    driver.findElement(By.xpath("//*[@id='main']/section/div/div[2]/a[1]")).click();
    driver.findElement(By.id("number")).clear();
    driver.findElement(By.id("number")).sendKeys("ttuytuuy");
    driver.findElement(By.cssSelector("button.btn.sendsms")).click();
  }
  
  @Test
  public void C37787() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Voxox IOS")).click();
    ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
    driver.findElement(By.xpath("//*[@id='main']/section/div/div[1]/a[1]")).click();
    new Select(driver.findElement(By.id("country"))).selectByVisibleText("Australia (+61)");
  }
  

  @AfterClass
  public void afterClass()  {
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
