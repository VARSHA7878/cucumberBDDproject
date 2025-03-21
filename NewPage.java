


	
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		public class NewPage
		{

			public static void main(String[] args)
			{
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("http://demo.automationtesting.in/Register.html");
				driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("123");
				driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("abc");
				driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("pune 123 gold");
						

	}

}
