import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectDEmo
{

       public static void main(String[] args)
			{
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
				Select mycountry = new Select(driver.findElement(By.cssSelector("select#country")));
				mycountry.selectByVisibleText("Antarctica");
				mycountry.selectByValue("10");
				mycountry.selectByIndex(0);
				mycountry.selectByIndex(25);
				List<WebElement> ddw =mycountry.getOptions();
				System.out.println(ddw.size());
				for(WebElement we : ddw)
				{
					System.out.println(we.getText());
					
				}
			}
				
				

	}

		
	


