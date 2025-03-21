package TestNGTT;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class NewTestAssignment2

{
	WebDriver driver;
  @Test(priority=1)
  public void google() 
  {
	 
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	
  }
  @Test(priority=2,groups={"smoke Test"})
  public void yhoo() 
  {
	
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com");
		System.out.println(driver.getTitle());
		
		
  }
 
	

@Test(priority=3,groups={"smoke Test"})
  public void live () 
  {
	  
		driver.manage().window().maximize();
		driver.get("http://www.live.com");
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(),"Microsoft Outlook Personal Email and Calendar | Microsoft 365");
		
  }
  @BeforeMethod //(groups={"smoke Test"})
  @Parameters("brow")
  
  public void launchBrowser(String browname)
  
  {
	 // System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
	  if(browname.equalsIgnoreCase("firefox"))
	  {
		driver = new FirefoxDriver();
	  }
	  if(browname.equalsIgnoreCase("chrome"))
	  {
		  driver = new ChromeDriver(); 
	  }
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
  @Parameters("brow")
  public void setBrowser(String browname)
  {
	  if(browname.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
	  }
	  if(browname.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\JarFiles\\chromedriver.exe");   
	  }
  }
	  
  
  
  
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
