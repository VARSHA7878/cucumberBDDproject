import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationPage {

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("abc");
		driver.findElement(By.id("newpasswd")).sendKeys("varsha");
		
		
	}

}
