package com.selenium;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
public class FilterTest10Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @SuppressWarnings("deprecation")
@Before
  public void setUp() {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  }
  
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void filterTest10() {
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("*[data-test=\"product_sort_container\"]")).click();
  }
}
