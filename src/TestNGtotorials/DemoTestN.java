package TestNGtotorials;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DemoTestN {
  @Test
  public void f() {
	  System.out.println("i am in f");
	  //this is called as test method
	  //the method which is marked with@test annotation is called test method 
	  //it should contain testcase
  }
  @Test
  public void f1() {
	  System.out.println("i am in f1");
	  //this is called as test method
	  //the method which is marked with@test annotation is called test method 
	  //it should contain testcase
  }
  @Test
  public void f2() {
	  System.out.println("i am in f2");
	  //this is called as test method
	  //the method which is marked with@test annotation is called test method 
	  //it should contain testcase
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in bm");
	//the method which is marked with @Beforemethod get executed before every test method
	 //the method which is marked which @Beforemethod will get executed before f, before f1,before f2 every @test method
	    
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

}
