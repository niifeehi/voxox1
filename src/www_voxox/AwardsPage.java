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


public class AwardsPage  {
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
  public void C37572() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Awards')])[2]")).click();
    
  }
  
  @Test
  public void C37573() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Awards')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/aside/ul/li[1]/a")).click();
  }
  
  @Test
  public void C37574() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Awards')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/aside/ul/li[2]/a")).click();
  }
  
  @Test
  public void C37575() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Awards')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/aside/ul/li[3]/a")).click();
  }
  
  @Test
  public void C37576() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Awards')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/aside/ul/li[4]/a")).click();
  }
  
  @Test
  public void C37577() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Awards')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/aside/ul/li[5]/a")).click();
  }
  
  @Test
  public void C37578() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Awards')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section/div/aside/a")).click();
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
