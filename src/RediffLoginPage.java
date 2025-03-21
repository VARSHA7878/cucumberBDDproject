

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RediffLoginPage 
{
	private static WebElement element;
	public static WebElement txtUsername(WebDriver driver)
	{
		element =driver.findElement(By.id("login1"));
		return element;
	}
	public static WebElement txtPassword(WebDriver driver)
	{
		element =driver.findElement(By.name("passwd"));
		return element;
	}
	public static WebElement btnSignIn(WebDriver driver)
	{
		
		element =driver.findElement(By.name("proceed"));
		return element;

		
	}

}
