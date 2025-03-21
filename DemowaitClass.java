import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemowaitClass
{

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		boolean flag = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'privacy')]"))).isDisplayed();
	
	if(flag) 
	{
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'privacy')]")).getText());
	}
	else
	{
		System.out.println("Defect Found");
	}

	}

}
