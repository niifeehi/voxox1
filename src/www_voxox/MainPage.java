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


public class MainPage {
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
public void C21196() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.linkText("Get VOXOX Free")).click();
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("button.close")).click();
}

@Test
public void  C21202() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.phones")).click();
  driver.findElement(By.xpath("//body[@id='top']/div[4]")).click();
}

@Test
public void C21203() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.font-apple")).click();
}


@Test
public void C21204() throws Exception {
  driver.get(baseUrl + "/");
  Thread.sleep(1000);
  driver.findElement(By.cssSelector("a.font-windows")).click();
}

@Test
public void C21205() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("a.font-android")).click();
}

@Test
public void C42111() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.linkText("special low rates")).click();
}

@Test
public void C42104() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("i.font-phone-dots.red")).click();
}

@Test
public void C42105() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("i.font-send-love.red")).click();
}

@Test
public void C42106() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("i.font-the-world")).click();
}

@Test
public void C42107() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.linkText("rates are cheap!")).click();
}

@Test
public void C42108() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("i.font-camara")).click();
}

@Test
public void C42109() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("i.font-browser-window")).click();
}

@Test
public void C42110() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.cssSelector("i.font-file-down")).click();
}

@Test
public void C21253() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.xpath("(//*[@id='home-icons']/div/div[3]/a[1])")).click();
}

@Test
public void C21254() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.linkText("TAKE THE TOUR")).click();
}

@Test
public void C21271() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.xpath("(//*[@id='main']/section[4]/div/div[1]/div/a)")).click();
}

@Test
public void C21272() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.xpath("(//*[@id='main']/section[4]/div/div[2]/div[1]/h3/a)")).click();
}
 
@Test
public void C21273() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.linkText("Learn More")).click();
}

@Test
public void C21274() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.xpath("(//*[@id='main']/section[4]/div/div[2]/div[2]/h3/a)")).click();

}

@Test
public void C21275() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.xpath("(//a[contains(text(),'Learn More')])[2]")).click();
}

@Test
public void C21276() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.linkText("CARRIER SERVICES")).click();
}

@Test
public void C21277() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.xpath("(//a[contains(text(),'Learn More')])[3]")).click();
}

@Test
public void C21278() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.xpath("(//*[@id='main']/section[4]/div/div[2]/div[4]/h3/a)")).click();
}



@Test
public void C21279() throws Exception {
  driver.get(baseUrl + "/");
  driver.findElement(By.xpath("(//a[contains(text(),'Learn More')])[4]")).click();
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

