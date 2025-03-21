import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Dragdrop1demo {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
		Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		//act.dragAndDropBy(drag, 164, 200).perform();
		/*act.clickAndHold(drag);
		act.moveToElement(drop);
		act.release();
		act.build().perform();*/
		
		/* Point droppoint =drop.getLocation();
         act.dragAndDropBy(drag, droppoint.x,droppoint.y).perform();*/

	}

}
