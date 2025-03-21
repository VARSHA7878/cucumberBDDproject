import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table123 {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		//List<WebElement> lw = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		List<WebElement> lw1 = driver.findElements(By.xpath("/a[contains(text(),'Welspun Corp')]"));
		for(WebElement pv :lw1)
		{
			System.out.println(pv.getText());
		}
		
		
		

	}

}
