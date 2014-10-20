package www_voxox;

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

public class BusinessPage  {
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
  public void C21620() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//section[@id='business-carousel']/a")).click();
  }
  
  @Test
  public void C21621() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='business-carousel']/a[2]")).click();
  }
  
  @Test
  public void C21622() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.linkText("Get a Quote!")).click();
    //driver.findElement(By.xpath("//*[@id='business-carousel']/div/div[3]/div/div/div[1]/a")).click();
  }
  
  @Test
  public void C21629() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[1]/a[1]")).click();
  }
  
  @Test
  public void C21630() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[1]/h3/a")).click();
  }
  
  @Test
  public void C21631() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[1]/a[2]")).click();
  }
  
  @Test
  public void C21632() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[2]/a[1]")).click();
  }
  
  @Test
  public void C21633() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[2]/h3/a")).click();
  }
  
  @Test
  public void C21634() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[2]/a[2]")).click();
  }
  
  @Test
  public void C21635() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[3]/a[1]")).click();
  }

  @Test
  public void C21636() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[3]/h3/a")).click();
  }
  

  @Test
  public void C21637() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[3]/a[2]")).click();
  }
  
  @Test
  public void C21638() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[4]/a[1]")).click();
  }
  
  @Test
  public void C21639() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[4]/h3/a")).click();
  }

  
  @Test
  public void C21640() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[2]/div/div/div[4]/a[2]")).click();
  }
  
  @Test
  public void C21641() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[3]/div/div[1]/a")).click();
  }
  
  @Test
  public void C21642() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[3]/div/div[2]/a")).click();
  }
  
  @Test
  public void C21643() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[4]/div/div[1]/a[1]")).click();
  }
  
  @Test
  public void C21644() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[4]/div/div[1]/a[2]")).click();
  }
  
  @Test
  public void C21646() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[4]/div/div[1]/a[3]")).click();
  }
  
  @Test
  public void C21647() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[4]/div/div[1]/a[4]")).click();
  }
  
  @Test
  public void C21648() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[4]/div/div[2]/a[1]")).click();
  }
  
  @Test
  public void C37920() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("drop5")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
    driver.findElement(By.xpath("//*[@id='main']/section[4]/div/div[2]/a[2]")).click();
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
