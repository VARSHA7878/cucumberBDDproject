import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("dd");
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[2]/div/div[2]/input")).sendKeys("www");
		driver.findElement(By.cssSelector("input#login1")).sendKeys("123456");
		//driver.findElement(By.id("password")).sendKeys("1238");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div/input")).sendKeys("111111111111");		
		driver.findElement(By.cssSelector("input#password")).sendKeys("mickey");
		//driver.findElement(By.name("proceed")).click();
		//driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div/input[2]")).click();
		driver.findElement(By.cssSelector("input.signinbtn")).click();		
	}

}
