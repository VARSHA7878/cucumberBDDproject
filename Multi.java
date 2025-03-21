import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		Select mycar = new Select(driver.findElement(By.cssSelector("select#cars")));
	    mycar.selectByValue("volvo");
		mycar.selectByIndex(2);
		mycar.selectByVisibleText("Audi");
		
		System.out.println(mycar.isMultiple());
		List<WebElement> dd=mycar.getOptions();
		System.out.println(dd.size());
		for(WebElement we :dd)
			
		{
			System.out.println(we.getText());
		}
		
		String carname =mycar.getFirstSelectedOption().getText();
		System.out.println(carname);
		
		
			
	}

		
}
	
		
	
		
	

	

	
