package TestNGTT;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DemotestAnnotation 
{
	//Annotation provide metadata of method
	//means what it(annotation)tells browser driver which to execute when
  @Test
  public void f()
  {
	  //This is called test method
	  //the method which is marked with @test annotation is called test method
	  //it should contain testcase
	  System.out.println("i am in f");
  }
  @Test(groups={"smoke Test"})
  public void f1()
  {
	  //This is called test method
	  //the method which is marked with @test annotation is called test method
	  //it should contain testcase
	  System.out.println("i am in f1");
  }
  @Test
  public void f2()
  {
	  //This is called test method
	  //the method which is marked with @test annotation is called test method
	  //it should contain testcase
	  System.out.println("i am in f2");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  //the method which is marked with @Beforemethod gets executed with every test method
	  //means what
	  // the method which is marked with @Beforemethod 
	  //will get executed before f ,before f1,before f2
	  //this will not get executed if method Notmarked with @test gets called
	  System.out.println("i am in beforemethod");
  }

  @AfterMethod
  public void afterMethod()
  {
	  //this will execute after every test method
	  System.out.println("i am in aftermethod"); 
  }

  @BeforeClass
  public void beforeClass() 
  {
	  //this method will be called before any class gets executed
	  System.out.println("i am in beforeclass");
  }

  @AfterClass
  public void afterClass() 
  {
	  //this will execute after a class execution
	  System.out.println("i am in afterclass");
  }

}
