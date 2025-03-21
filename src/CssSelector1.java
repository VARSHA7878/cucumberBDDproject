import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelector1 {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window();
		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("ffff");
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("ffff");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("bhalu");
		//driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("bhalu");
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("kharadi");
		driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("varsha12345@gmail.com");
		driver.findElement(By.cssSelector("input#firstpassword")).sendKeys("ssssssssssssss");
		driver.findElement(By.cssSelector("div#msdd")).click();
		
		
		
	}

}
