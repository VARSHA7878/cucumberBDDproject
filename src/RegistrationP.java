import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationP {
	public static void main(String[] args)
	{
	
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	driver =new FirefoxDriver();
	driver.manage().window();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rahul");
	driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("yashu");
	
	driver.findElement(By.cssSelector("#newpasswd")).sendKeys("111111111111");
	driver.findElement(By.cssSelector("#eyeiconNew")).click();	
	driver.findElement(By.id("mobno")).sendKeys("9867453434");
	}
}

//cssSelector("input[placeholder='Last Name']"
//By.name("proceed"))