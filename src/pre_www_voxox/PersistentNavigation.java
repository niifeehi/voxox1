package pre_www_voxox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;




//import java.util.regex.Pattern;



//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PersistentNavigation {
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
public void C39962() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
}

@Test
public void C38419() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("a.sprite.logo")).click();
}

@Test
public void C38423() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop6")).click();
}

@Test
public void C39963() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop1")).click();
  driver.findElement(By.linkText("Android")).click();
}

@Test
public void C39964() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop1")).click();
  driver.findElement(By.linkText("iPhone")).click();
}

@Test
public void C38420() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop2")).click();
  driver.findElement(By.xpath("(//a[contains(text(),'About')])[2]")).click();
}

@Test
public void C39965() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop2")).click();
  driver.findElement(By.linkText("Contact")).click();
}

@Test
public void C39966() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop2")).click();
  driver.findElement(By.linkText("Blog")).click();
}

@Test
public void C39967() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop2")).click();
  driver.findElement(By.linkText("News Room")).click();
}

@Test
public void C39968() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop2")).click();
  driver.findElement(By.linkText("Team")).click();
}

@Test
public void C39969() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop2")).click();
  driver.findElement(By.linkText("Awards")).click();
}

@Test
public void C39970() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop3")).click();
  driver.findElement(By.xpath("(//a[contains(text(),'Help')])[2]")).click();
}

@Test
public void C39971() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop3")).click();
  driver.findElement(By.linkText("Downloads")).click();
}

@Test
public void C39972() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop3")).click();
  driver.findElement(By.linkText("Calling Rates")).click();
}

@Test
public void C39973() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop3")).click();
  driver.findElement(By.linkText("iOS Guide")).click();
}

@Test
public void C38421() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Technology Partners")).click();
}

@Test
public void C39974() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Channel Partners")).click();
}

@Test
public void C39975() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Operator Partners")).click();
}

@Test
public void C38422() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.xpath("(//a[contains(text(),'Business')])[2]")).click();
}

@Test
public void C39976() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.linkText("SIP Trunks")).click();
}

@Test
public void C39977() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.linkText("Hosted PBX")).click();
}

@Test
public void C39978() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.linkText("SMS Solutions")).click();
}

@Test
public void C39979() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.linkText("Carrier & Wholesale")).click();
}

@Test
public void C39980() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.linkText("Business Rates - Outbound")).click();
}

@Test
public void C39981() throws Exception {
  driver.get(baseUrl + "/");
  ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,180)", "");
  Thread.sleep(1000);
  driver.findElement(By.id("drop5")).click();
  driver.findElement(By.xpath("//div[@id='main']/header/div/nav/ul/li[5]/ul/li[8]/a")).click();
}


@AfterClass
public void afterClass()  {
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

