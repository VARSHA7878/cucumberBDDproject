
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver

public class BasicLocators {

	public static void main(String[] args)
	{
		//https://mail.rediff.com/cgi-bin/login.cgi
		/*WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[2]/div/div[2]/input")).sendKeys("seed");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.name("proceed")).click();*/
		
		System.setProperty("webdriver.chrome.driver","C:\\User\\\varsh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

	}

}
