import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoImplicitwait {



	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//a[@class='nI-gNb-heading']"))

	}

}
