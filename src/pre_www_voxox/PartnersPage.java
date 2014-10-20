package pre_www_voxox;

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

public class PartnersPage {
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
public void C21330() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Technology Partners")).click();
  driver.findElement(By.cssSelector("ul.unstyled.about > li > a")).click();
}

@Test
public void C21331() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Technology Partners")).click();
  driver.findElement(By.xpath("(//a[contains(text(),'Channel Partners')])[2]")).click();
}

@Test
public void C37733() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Operator Partners")).click();
  driver.findElement(By.xpath("(//*[@id='main']/section/div/aside/ul/li[3]/a)")).click();
}

@Test
public void C21332() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Technology Partners")).click();
  driver.findElement(By.linkText("Download VOXOX")).click();
}

@Test
public void C21333() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Technology Partners")).click();
  driver.findElement(By.linkText("Voxox In Business")).click();
}

@Test
public void C37734() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Technology Partners")).click();
  driver.findElement(By.linkText("Voxox In Business")).click();
  driver.findElement(By.xpath("(//*[@id='main']/section/div/div/div[5]/div[2]/p/a)")).click();

}

@Test
public void C37735() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Technology Partners")).click();
  driver.findElement(By.linkText("Voxox In Business")).click();
  driver.findElement(By.xpath("(//*[@id='main']/section/div/div/div[6]/div[2]/p/a)")).click();
}

@Test
public void C37736() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.id("drop4")).click();
  driver.findElement(By.linkText("Technology Partners")).click();
  driver.findElement(By.linkText("Voxox In Business")).click();
  driver.findElement(By.xpath("(//*[@id='main']/section/div/div/div[7]/div[2]/p/a)")).click();
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


