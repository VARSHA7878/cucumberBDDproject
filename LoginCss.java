import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginCss 
{

	public static void main(String[] args)
	{
		
		        //https://mail.rediff.com/cgi-bin/login.cgi
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				driver.manage().window().maximize();
				driver.findElement(By.cssSelector("input#login1")).sendKeys("seed");
				driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("123");
				//driver.findElement(By.cssSelector("input.signinbtn")).click();
				
				Boolean status = driver.findElement(By.xpath("//input[@id='remember']")).isDisplayed();
                 System.out.println(status);
                 status = driver.findElement(By.xpath("//input[@id='remember']")).isEnabled();
                 System.out.println(status);
                 status = driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
                 System.out.println(status);
                 driver.findElement(By.xpath("//input[@id='remember']")).click();
                 status = driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
                 System.out.println(status);
                 
			}
	

	}


