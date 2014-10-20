package www_voxox;

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

public class DownloadPage {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
  public void beforeClass() {
    baseUrl = "http://www.voxox.com/";
    System.setProperty("webdriver.chrome.driver", "C:/Selenium/ALLJARs/webdriver/selenium-2.39.0/chromedriver.exe");
    driver = new ChromeDriver();  
  }

  @Test
  public void C37768() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[3]/a")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/div[1]/a[1]")).click();
  }
  
  @Test
  public void C37580() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[3]/a")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/div[1]/a[1]")).click();
  }
  
  @Test
  public void C37581() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[3]/a")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/div[2]/a[1]")).click();
  }
  
  @Test
  public void C37582() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[3]/a")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/div[3]/a")).click();
  }
  
  @Test
  public void C37583() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.xpath("//*[@id='main']/header/div/nav/ul/li[3]/ul/li[3]/a")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/div[4]/a")).click();
  }
  

  @AfterClass
  public void afterClass(){
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
