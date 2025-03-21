import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class DemoDynamicMenu 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.co.uk/");
		Thread.sleep(5000);
		Actions act =new Actions(driver);
		WebElement menugolf = driver.findElement(By.xpath("//a[@class='a-level-1'][contains(text(),'Golf Clubs')]"));
		 act.moveToElement(menugolf).perform();
		// Thread.sleep(2000);
		/*List<WebElement> submenus = driver.findElements(By.xpath
				("//ul[@class='menu-category ul-level-1']/li[3]"
				+"/div/div/div/div/"
				+ "ul[@class='category-groups']"
				+ "/li[@class='category-group']"
				+ "/ul[@class='category-group-block ul-level-2 toggle-content expanded']"
				+ "/li[@class='li-level-2']/a[@class='a-level-2']"));
		
		for(WebElement we : submenus)
		{
			System.out.println(we.getText());
		}*/
		
	}
}
			
		
		
		
		
		

	


