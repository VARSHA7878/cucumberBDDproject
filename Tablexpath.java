import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tablexpath {

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> tcompanyname =driver.findElements(By.xpath("//table/thead/tr/th[4]"));
		for(WebElement we : tcompanyname)
		{
			System.out.println(we.getText());
		}
		
		

	}

}
