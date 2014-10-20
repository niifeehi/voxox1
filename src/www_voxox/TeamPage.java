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
import org.openqa.selenium.remote.RemoteWebDriver;

public class TeamPage {
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
  public void C37791() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
    driver.findElement(By.cssSelector("span.name")).click();
    driver.findElement(By.cssSelector("button.close")).click();
  }
  
  @Test
  public void C37793() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
    driver.findElement(By.xpath("//div[@id='main']/section/div/div[2]/a/span[2]")).click();
    driver.findElement(By.cssSelector("#kevin > div.modal-header > button.close")).click();
  }
  
  @Test
  public void C37795() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
    driver.findElement(By.xpath("//div[@id='main']/section/div/div[3]/a/span")).click();
    driver.findElement(By.cssSelector("#bob > div.modal-header > button.close")).click();
  }

  @Test
  public void C37797() throws Exception {
	 driver.get(baseUrl + "/");
	 driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
	 driver.findElement(By.xpath("//div[@id='main']/section/div/div[4]/a/span[2]")).click();
	 driver.findElement(By.cssSelector("#pertti > div.modal-header > button.close")).click();
  }


  
  @Test
  public void C37799() throws Exception {
	 driver.get(baseUrl + "/");
	 driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
	 ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
	 driver.findElement(By.xpath("//*[@id='main']/section/div[2]/div[1]/a/span[2]")).click();
	 driver.findElement(By.cssSelector("#cliff > div.modal-header > button.close")).click();
  }
  
  
  @Test
  public void C37801() throws Exception {
	 driver.get(baseUrl + "/");
	 driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
	 ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,350)", "");
	 driver.findElement(By.xpath("//div[@id='main']/section/div[2]/div[2]/a/span")).click();
	 driver.findElement(By.cssSelector("#jim > div.modal-header > button.close")).click();
  }
  
  @Test
  public void C37803() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
    Thread.sleep(1000);
    ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,350)", "");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='main']/section/div[2]/div[3]/a/span[2]")).click();
    driver.findElement(By.cssSelector("#joe > div.modal-header > button.close")).click();
  }
  
  @Test
  public void C37805() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
    ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
    driver.findElement(By.xpath("//div[@id='main']/section/div[2]/div[4]/a/span")).click();
    driver.findElement(By.cssSelector("#curtis > div.modal-header > button.close")).click();
  }
  
  @Test
  public void C37807() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
    ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,400)", "");
    driver.findElement(By.xpath("//div[@id='main']/section/div[3]/div/a/span[2]")).click();
    driver.findElement(By.cssSelector("#ed > div.modal-header > button.close")).click();
  }
  
  @Test
  public void C37809() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
    ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,400)", "");
    driver.findElement(By.xpath("//div[@id='main']/section/div[3]/div[2]/a")).click();
    driver.findElement(By.cssSelector("#tristan > div.modal-header > button.close")).click();
  }
  
  @Test
  public void C37811() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("(//a[contains(text(),'Team')])[2]")).click();
    ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,400)", "");
    driver.findElement(By.xpath("//div[@id='main']/section/div[3]/div[3]/a/span[2]")).click();
    driver.findElement(By.cssSelector("#tad > div.modal-header > button.close")).click();
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
