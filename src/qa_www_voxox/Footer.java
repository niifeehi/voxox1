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

public class Footer {
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
  public void C37594() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("a.sprite.footer-logo")).click();
    
  }
  
  @Test
  public void C37595() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[1]/div/a[1]")).click();
    
  }
  
  @Test
  public void C37596() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[1]/div/a[2]")).click();  
  }
  
  @Test
  public void C37597() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[1]/div/a[3]")).click();    
  }
  
  @Test
  public void C37598() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[1]/div/a[4]")).click();    
  }
  
  @Test
  public void C37599() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[2]/ul/li[1]/a")).click();
  }
  
  @Test
  public void C37600() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[2]/ul/li[2]/a")).click();
  }
  
  
  @Test
  public void C37601() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[2]/ul/li[3]/a")).click();
  }
  
  @Test
  public void C37602() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[2]/ul/li[4]/a")).click(); 
  }
  
  @Test
  public void C37603() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[2]/ul/li[5]/a")).click();  
  }
  
  @Test
  public void C37604() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[2]/ul/li[6]/a")).click();  
  }
  
  @Test
  public void C37605() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[2]/ul/li[7]/a")).click();  
    
  }
  
  @Test
  public void C37606() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[3]/ul/li[1]")).click();  
    
  }
  
  @Test
  public void C37607() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[3]/ul/li[2]/a")).click();  
    
  }
  
  @Test
  public void C37608() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[3]/ul/li[3]/a")).click();  
    
  }
  
  @Test
  public void C37609() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[4]/ul/li[1]/a")).click();  
    
  }
  
  @Test
  public void C37610() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[4]/ul/li[2]/a")).click();  
    
  }
  
  @Test
  public void C37611() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[4]/ul/li[3]/a")).click();  
    
  }
/*  
  @Test
  public void C37612() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[2]/ul/li[14]/a")).click();  
    
  }
  */
  @Test
  public void C37613() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[4]/ul/li[5]/a")).click();  
    
  }
  
  @Test
  public void C37614() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[4]/ul/li[6]/a")).click();  
    
  }
  
  @Test
  public void C37615() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[4]/ul/li[7]/a")).click();  
    
  }
  
  @Test
  public void C37616() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[4]/ul/li[8]/a")).click();  
    
  }
  
  @Test
  public void C37617() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[5]/ul/li[1]/a")).click();  
    
  }
  
  @Test
  public void C37618() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[5]/ul/li[2]/a")).click();  
    
  }
  
  @Test
  public void C37619() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[5]/ul/li[3]/a")).click();  
    
  }
  
  @Test
  public void C37620() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[5]/ul/li[4]/a")).click();  
    
  }
  
  @Test
  public void C37621() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[5]/ul/li[5]/a")).click();  
    
  }
  
  @Test
  public void C37622() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[5]/ul/li[6]/a")).click();  
    
  }
  
  
  @Test
  public void C37623() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//*[@id='top']/footer/section/div/div[5]/ul/li[7]/a")).click();  
    
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
