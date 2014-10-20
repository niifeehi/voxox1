package pre_www_voxox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;




//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;

//import static org.junit.Assert.*;


//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class OperatorPartnerPage {
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
  public void C37740() throws Exception {
    driver.get(baseUrl + "/operators");
    driver.findElement(By.id("drop4")).click();
    driver.findElement(By.linkText("Operator Partners")).click();
  }
  
  @Test
  public void C37738() throws Exception {
	driver.get(baseUrl + "/operators");
    driver.findElement(By.id("drop4")).click();
    driver.findElement(By.linkText("Operator Partners")).click();
    driver.findElement(By.xpath("//*[@id='ops-side']/ul/li[1]/a")).click();
  }
 
  @Test
  public void C37739() throws Exception {
	 driver.get(baseUrl + "/operators");
    driver.findElement(By.id("drop4")).click();
    driver.findElement(By.linkText("Operator Partners")).click();
    driver.findElement(By.xpath("//*[@id='ops-side']/ul/li[2]/a")).click();
  }
  

  @Test
  public void C37741() throws Exception {
    driver.get(baseUrl + "/operators");
    driver.findElement(By.id("drop4")).click();
    //driver.findElement(By.linkText("Operator Partners")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div/article[5]/ul/li[4]")).click();
    
  }

  @Test
  public void C37742() throws Exception {
    driver.get(baseUrl + "/operators");
    driver.findElement(By.id("drop4")).click();
    //driver.findElement(By.linkText("Operator Partners")).click();
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[2]/strong")).click();
  }
  
  @Test
  public void C37737() throws Exception {
    driver.get(baseUrl + "/operators");
    driver.findElement(By.id("drop4")).click();
    //driver.findElement(By.linkText("Operator Partners")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[1]/div/div/div[2]/a")).click();
  }


  @AfterClass
  public void afterClass() {
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
