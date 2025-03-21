import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoMultipleWindowhandle {

	public static void main(String[] args) throws InterruptedException 
	{
		
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
			//System.setProperty("webdriver.chrome.driver","C:\\JarFiles\\chromedriver-win64\\chromedriver.exe");
			driver = new FirefoxDriver();
			//driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			//tagname[comtains(text(),"valueof attribute")]
			driver.findElement(By.cssSelector("span.ntc__chip-label")).click();
		Set<String> winhlds =driver.getWindowHandles();
		Iterator<String> i =winhlds.iterator();
		String mainwin =i.next();
		String newwin =i.next();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.switchTo().window(newwin);
		System.out.println(driver.getTitle());
		driver.switchTo().window(mainwin);
		System.out.println(driver.getTitle());

	}

}
