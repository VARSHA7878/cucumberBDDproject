import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	
	
		public static void main(String[] args) 
		{
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
	     
		

	}

}
