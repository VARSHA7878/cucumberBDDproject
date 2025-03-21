import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DEmowindows {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\varsh\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window();
		driver.get("https://www.amazon.in/s/ref=mega_elec_s23_2_2_1_2?rh=i%3Acomputers%2Cn%3A4363894031&ie=UTF8");
		String title =driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("s-image")).click();
		
		
		
		Set<String> handle =driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentwindowid = it.next();
		System.out.println("parent"+parentwindowid);
		
		String childwindowid = it.next();
		System.out.println("child"+childwindowid);
		
		driver.switchTo().window(childwindowid);
		Thread.sleep(5000);
		String title1 =driver.getTitle();
		System.out.println(title1);
		
		
	}

}
