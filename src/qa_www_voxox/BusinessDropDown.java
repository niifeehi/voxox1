package qa_www_voxox;

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

public class BusinessDropDown {
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
public void testC38418() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
}

@Test
public void testC37728() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.linkText("SIP Trunks")).click();
}

@Test
public void testC37729() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.linkText("Hosted PBX")).click();
}

@Test
public void testC37730() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.linkText("SMS Solutions")).click();
}

@Test
public void testC37731() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.linkText("Carrier & Wholesale")).click();
}

@Test
public void testC37732() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.linkText("Business Rates - Outbound")).click();
}

@Test
public void testC38414() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.xpath("//div[@id='main']/header/div/nav/ul/li[5]/ul/li[8]/a")).click();
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


