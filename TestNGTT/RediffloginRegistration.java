package TestNGTT;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class RediffloginRegistration 
{
	WebDriver driver;
  @Test
  public void loginvalid()
  {
	  System.out.println("in rediff loginvalid");
  }
  @Test(dataProvider="login") 
 public void logininvalid(String un,String pass) 
      {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[2]/div/div[2]/input")).sendKeys("seed");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.name("proceed")).click();

	  
  }
  @Test
  public void regnew()
  {
	  System.out.println("registration");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
	  driver = new FirefoxDriver();
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
  @DataProvider(name="login")
  public Object[][] login()
  {
	  Object[][] obj=new Object[3][2];
	  obj[0][0]="seed";
	  obj[1][1]="seed123";
	  obj[2][0]="admin";
	  obj[0][1]="admin123";
	  obj[1][0]="hello";
	  obj[2][1]="welcome";
	return obj;
  }

}
