package Rediff;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RediffLoginTest 
{
 
	WebDriver driver;
  @Test
  public void validlogin()
  {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  RediffLoginPage.txtUsername(driver).sendKeys("seed");
	  RediffLoginPage.txtPassword(driver).sendKeys("seed123");
	  RediffLoginPage.btnSignIn(driver).click();
  }
  @BeforeMethod
  public void beforeMethod() {

	  System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
	  driver = new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() 
  {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
