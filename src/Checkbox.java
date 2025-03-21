import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Boolean status= driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
		System.out.println(status);
		 status= driver.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();
		System.out.println(status);
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();//false
		status= driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(status);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();//true
		status= driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(status);

	}
}
