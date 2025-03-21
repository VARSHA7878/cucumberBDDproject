import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragDrop {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
	    
	    driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
        WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
         Actions act=new Actions(driver);
         
         act.dragAndDrop(drag, drop).perform();
        // act.dragAndDropBy(drag, 164,200).perform();
        /* act.clickAndHold(drag);
         act.moveToElement(drop);
         act.release();
         act.build().perform();*/
         
        /* Point droppoint =drop.getLocation();
         act.dragAndDropBy(drag, droppoint.x,droppoint.y).perform();
         
         File scrFile=
        		 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(scrFile,new File("C:\\Users\\varsh\\OneDrive\\Pictures\\Screenshots"));*/
         


	}


}

	
	

	
	


