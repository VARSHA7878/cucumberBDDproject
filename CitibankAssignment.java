import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CitibankAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
	
			
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.online.citibank.co.in/");
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/a[1]")).click();
				driver.findElement(By.xpath("//body[1]/div[4]/div[2]/div[1]/div[5]/ul[3]/li[1]/a[1]/span[2]")).click();
				driver.findElement(By.cssSelector("span.txtSign")).click();	
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
