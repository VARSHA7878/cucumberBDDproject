import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotDemo
{

	public static void main(String[] args) throws IOException
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://jqueryui.com/droppable/");
		//File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
       // File destfile= new File("C://JarFiles//screen.png");
       // FileUtils.copyFile(scrFile, destfile);
		driver.get("http://www.naukri.com");	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//a[@class='nI-gNb-heading']")).getText());

	}

}
