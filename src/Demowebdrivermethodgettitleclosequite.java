import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebdrivermethodgettitleclosequite {

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://www.google.com");
		String cururl = driver.getCurrentUrl();
	    System.out.println(cururl);
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		//driver.quit();
		

	}

}
