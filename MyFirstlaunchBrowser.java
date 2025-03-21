import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstlaunchBrowser {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
		//WebDriver driver;
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		 //driver = new FirefoxDriver();
		 driver.get("https://www.google.com");
     
	}

}
