package TestNGtotorials;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest33 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
	  
  }
  @Test(priority=1)
  public void f1() {
	  driver.get("https://in.search.yahoo.com/");
		System.out.println(driver.getTitle());
	  
  }
  @Test(priority=2,groups = {"smoketest"})
  public void f2() {
	  driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
	  
  }
  @BeforeMethod(groups= {"smoke test"})
  public void beforeMethod() {
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
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
