import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("works")).click();
		//driver.findElement(By.partialLinkText("Our approach")).click();
		List<WebElement> lnks = driver.findElements(By.tagName("a"));
		System.out.println(lnks.size());
		for(WebElement we: lnks)
		{
			System.out.println(we.getText());
		}
		
		
	}

}
