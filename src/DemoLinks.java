import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLinks {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Search works")).click();
		//to find all link on google
		List<WebElement>  links =  driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement we : links)
		{
			System.out.println(we.getText());
		}
		
		

	}

}
