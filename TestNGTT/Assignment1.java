package TestNGTT;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Assignment 

{
	WebDriver driver;
  @Test
  public void googletitle()
  {
	  System.out.println(driver.getTitle());
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  
  }

  @BeforeTest
  public void launchbrowser() 
  {
	
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
 }

  @AfterTest
  public void closebrowser() 
  {
	  
	  driver.close();
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  
  }

  @AfterSuite
  public void afterSuite() 
  {
	  
  }

}
