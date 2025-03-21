import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAlert {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window();
		driver.get("https://demoqa.com/alerts");
		//driver.findElement(By.id("alertButton")).click();
		//Alert a= driver.switchTo().alert();
		//System.out.println(a.getText());
		//a.accept();
		/*driver.switchTo().defaultContent();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Alert b = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);*/
		
		
		
		
		driver.findElement(By.id("confirmButton")).click();
		Alert c = driver.switchTo().alert();
		System.out.println(c.getText());
		c.accept();
		
		
		
		
		//driver.findElement(By.id("promtButton")).click();
		//Alert d = driver.switchTo().alert();
		//d.sendKeys("345");
		
		
		
		
		
	}

}
