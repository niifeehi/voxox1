package www_voxox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


//*import java.util.regex.Pattern;
//import static org.hamcrest.CoreMatchers.*;


//import java.util.concurrent.TimeUnit;

//import org.junit.*;

//import static org.junit.Assert.*;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SMSModal {
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
public void C38427() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
 }

@Test
public void C38428() throws Exception {
  driver.get(baseUrl + "/");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("a.phones")).click();
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("button.btn.sendsms")).click();
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("button.close")).click();
}

@Test
public void C39982() throws Exception {
  driver.get(baseUrl + "/");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("a.phones")).click();
  Thread.sleep(1000);
  new Select(driver.findElement(By.id("os_select"))).selectByVisibleText("IOS");
  Thread.sleep(1000);
  new Select(driver.findElement(By.id("os_select"))).selectByVisibleText("Please Select");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("button.close")).click();
}

@Test
public void C39988() throws Exception {
  driver.get(baseUrl + "/");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("a.phones")).click();
  Thread.sleep(1000);
  new Select(driver.findElement(By.id("country"))).selectByVisibleText("Zimbabwe (+263)");
}

@Test
public void  C38429() throws Exception {
  driver.get(baseUrl + "/");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("a.phones")).click();
  Thread.sleep(1000);
  new Select(driver.findElement(By.id("country"))).selectByVisibleText("Philippines (+63)");
}

@Test
public void C38430() throws Exception {
  driver.get(baseUrl + "/");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("a.phones")).click();
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("button.btn.sendsms")).click();
}

@Test
public void C39989() throws Exception {
  driver.get(baseUrl + "/");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("a.phones")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("number")).clear();
  Thread.sleep(1000);
  driver.findElement(By.id("number")).sendKeys("343455454454");
}

@Test
public void C38434() throws Exception {
  driver.get(baseUrl + "/");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("a.phones")).click();
  Thread.sleep(1000);
  new Select(driver.findElement(By.id("os_select"))).selectByVisibleText("Please Select");
  Thread.sleep(1000);
  driver.findElement(By.id("number")).sendKeys("334435445455");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("button.btn.sendsms")).click();
}

@Test
public void C40790() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  Thread.sleep(1000);
  new Select(driver.findElement(By.id("os_select"))).selectByVisibleText("Android");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("button.btn.sendsms")).click();
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("button.btn.sendsms")).click();
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("button.btn.sendsms")).click();
}

@Test
public void C39990() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  new Select(driver.findElement(By.id("os_select"))).selectByVisibleText("Android");
  driver.findElement(By.id("number")).clear();
  driver.findElement(By.id("number")).sendKeys("56645654556");
  driver.findElement(By.cssSelector("button.btn.sendsms")).click();
  driver.findElement(By.cssSelector("#alert > div.modal-header > button.close")).click();
}

@Test
public void C40791() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  new Select(driver.findElement(By.id("os_select"))).selectByVisibleText("Android");
  new Select(driver.findElement(By.id("country"))).selectByVisibleText("United States (+1)");
  driver.findElement(By.id("number")).clear();
  driver.findElement(By.id("number")).sendKeys("6267206748");
  driver.findElement(By.cssSelector("button.btn.sendsms")).click();
  driver.findElement(By.cssSelector("#alert > div.modal-header > button.close")).click();
}

@Test
public void C40792() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  new Select(driver.findElement(By.id("os_select"))).selectByVisibleText("IOS");
  new Select(driver.findElement(By.id("country"))).selectByVisibleText("United States (+1)");
  driver.findElement(By.id("number")).clear();
  driver.findElement(By.id("number")).sendKeys("6267206742");
  driver.findElement(By.cssSelector("button.btn.sendsms")).click();
  driver.findElement(By.cssSelector("#alert > div.modal-header > button.close")).click();
}

@Test
public void C40793() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  new Select(driver.findElement(By.id("os_select"))).selectByVisibleText("Android");
  new Select(driver.findElement(By.id("country"))).selectByVisibleText("United States (+1)");
  driver.findElement(By.id("number")).clear();
  driver.findElement(By.id("number")).sendKeys("6267206748");
  driver.findElement(By.cssSelector("button.btn.sendsms")).click();
  driver.findElement(By.cssSelector("#alert > div.modal-header > button.close")).click();
}

@Test
public void C38431() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  driver.findElement(By.cssSelector("a.font-hex-apple")).click();
}


@Test
public void C38432() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  driver.findElement(By.cssSelector("a.font-hex-android")).click();
}

@Test
public void C38433() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  driver.findElement(By.cssSelector("a.font-hex-windows")).click();
}


@Test
public void C38435() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("button.close")).click();
}


@Test
public void C38436() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  driver.findElement(By.xpath("//body[@id='top']/div[4]")).click();
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

