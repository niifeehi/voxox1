package qa_www_voxox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

//import java.util.concurrent.TimeUnit;

/*import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;*/

// import java.util.regex.Pattern;
// import java.util.concurrent.TimeUnit;
// import org.junit.*;


import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.support.ui.Select;

public class IOSSideBarLinks {
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
  public void C37753() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[1]/a")).click();
  }
  
  @Test
  public void C37754() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[2]/a")).click();
  }
  
  @Test
  public void C37755() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[3]/a")).click();
  }
  
  @Test
  public void C37756() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[4]/a")).click();
  }
  
  @Test
  public void C37757() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[5]/a")).click();
  }
  
  @Test
  public void C37758() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[6]/a")).click();
  }
  
  @Test
  public void C37765() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[7]/a")).click();
  }
  
  @Test
  public void C37759() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[8]/a")).click();
  }
  
  @Test
  public void C37760() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[9]/a")).click();
  }
  
  @Test
  public void C37761() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[10]/a")).click();
  }
  
  @Test
  public void C37762() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[11]/a")).click();
  }
  
  @Test
  public void C37763() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[12]/a")).click();
  }
  
  
  @Test
  public void C37764() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop3")).click();
    driver.findElement(By.linkText("iOS Guide")).click();
    driver.findElement(By.xpath("//*[@id='scroller']/ul/li[13]/a")).click();
  }
  
  
  @AfterClass
  public void afterClass()   {
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


