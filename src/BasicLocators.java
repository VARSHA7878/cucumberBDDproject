import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicLocators {

	public static void main(String[] args)
	{
		
	WebDriver driver;
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	//driver = new FirefoxDriver();/
	System.setProperty("webdriver.chrome.driver","C:\\Users\\varsh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window();
	/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys("Seed");
	driver.findElement(By.id("password")).sendKeys("1238");
	driver.findElement(By.name("proceed")).click();*/
	

		driver.get("https://www.meesho.com/");
		driver.findElement(By.className("sc-pyfCe leNxcK hover")).click();
		//driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9324292928"));
		//driver.findElement(By.linkText("Continue")).click();
		

	}

}
