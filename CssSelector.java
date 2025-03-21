


 	
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		public class CssSelector 
		{

			public static void main(String[] args)
			{
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("http://demo.automationtesting.in/Register.html");
				driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("varsha");
				driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("badne");
				driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("mumbai");
				driver.findElement(By.cssSelector("input[type='email']")).sendKeys("varshabadne@gamil.com");
				driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("9834567890");
				
				driver.findElement(By.cssSelector("input[type='text']")).sendKeys("english");
	}

}
