import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Select dd=new Select(driver.findElement(By.xpath("//select[starts-with(@name,'hintq')]")));
		
		driver.findElement(By.cssSelector("input.nomargin")).click();
		
		Select mycountry= new Select(driver.findElement(By.cssSelector("select#country")));
		mycountry.selectByIndex(5);
		//mycountry.selectByVisibleText("Anguilla");
		//mycountry.selectByValue("10");
		//mycountry.selectByIndex(10);
		System.out.println(mycountry.getFirstSelectedOption().getText());
		List<WebElement> gh=mycountry.getOptions();
		System.out.println(gh.size());
		for( WebElement ww:gh)
{
          System.out.println(ww.getText());
}
		Select day= new Select(driver.findElement(By.xpath("//select[starts-with(@name,'DOB')]")));
			day.selectByIndex(6);
			day.selectByVisibleText("27");
		}	
	}


