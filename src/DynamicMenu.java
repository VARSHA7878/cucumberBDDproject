import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class DynamicMenu {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	
		driver.get("https://www.amazon.in/");
		
		WebElement prime =driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1"));
	//WebElement prime =driver.findElement(By.cssSelector("a#nav-link-amazonprime"));
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		act.moveToElement(prime).perform();
		List<WebElement> submenus = driver.findElements(By.xpath("//span[contains(text(),'Account & Lists')]"));
		for(WebElement we :submenus)
	{
		System.out.println(we.getText());
	}
}
	


	

}
