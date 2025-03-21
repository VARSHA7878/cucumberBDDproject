import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		//this is also correct//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium",Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'About Selenium')]")).click();
		
		
		
	

	}

}
