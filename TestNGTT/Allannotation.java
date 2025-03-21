package TestNGTT;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Allannotation 
{
  @Test 
  public void f()
  {
	  System.out.println("i am in test");
	  xyz();
  }
  public void xyz()
  {
	  xyz();
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("i am in beforemethod");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("i am in aftermethod");
	  
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("i am in beforeclass");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("i am in afterclass");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("i am in beforetest");
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("i am in aftertest");
	  
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("i am in beforeSuite");
	  
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("i am in aftersuite");
	  
  }

}
