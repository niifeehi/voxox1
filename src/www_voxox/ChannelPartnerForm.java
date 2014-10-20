package www_voxox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;



//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;

//import org.junit.*;

//import static org.junit.Assert.*;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class ChannelPartnerForm {
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
public void C21615() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Channel Partners")).click();
  driver.findElement(By.linkText("Become a Channel Partner")).click();
  driver.findElement(By.xpath("(//*[@id='hs_cos_wrapper_social_sharing']/a[1]/img)")).click();

}

@Test
public void C21616() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Channel Partners")).click();
  driver.findElement(By.linkText("Become a Channel Partner")).click();
  driver.findElement(By.xpath("(//*[@id='hs_cos_wrapper_social_sharing']/a[2]/img)")).click();
}

@Test
public void C21617() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Channel Partners")).click();
  driver.findElement(By.linkText("Become a Channel Partner")).click();
  driver.findElement(By.xpath("(//*[@id='hs_cos_wrapper_social_sharing']/a[3]/img)")).click();
}

@AfterClass
public void afterClass() {
  driver.quit();
  String verificationErrorString = verificationErrors.toString();
  if (!"".equals(verificationErrorString)) {
   // fail(verificationErrorString);
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
