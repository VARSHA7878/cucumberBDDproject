import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAlertHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();	
		
		Alert a =driver.switchTo().alert();
		System.out.println(a.getText());
		
		a.accept();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Alert b =driver.switchTo().alert();
		System.out.println(b.getText());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		b.accept();
		driver.findElement(By.id("confirmButton")).click();
		Alert c = driver.switchTo().alert();
		System.out.println(c.getText());
		
		driver.findElement(By.id("promtButton")).click();
		c.sendKeys("abc");
		c.accept();
		
		
		
		

	}

}
