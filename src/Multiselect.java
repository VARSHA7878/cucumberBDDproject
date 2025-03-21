import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window();
		driver.get("https://demoqa.com/select-menu");
	     Thread.sleep(2000);
		Select cr = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
		
	
	    System.out.println(cr.isMultiple());
	    
	 List<WebElement> dd= cr.getOptions();
	 System.out.println(dd.size());
	 for(WebElement we :dd)
	 {
		 System.out.println(we.getText());
	 }
	 
		

	}

}
