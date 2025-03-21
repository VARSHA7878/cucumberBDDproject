import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultiselect {

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		Select ddcar= new Select(driver.findElement(By.xpath("//select[@id='cars']")));
	    ddcar.selectByValue("volvo");
	    ddcar.selectByVisibleText("Opel");
	   
	    
	    
	    
	}

}
