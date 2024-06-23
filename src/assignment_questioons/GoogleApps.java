package assignment_questioons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleApps {

	
	// opening google maps using enum 
	public static void main(String[] args) throws InterruptedException 
	{
		workingIframe();
	}
	 public static void workinEnum() throws InterruptedException
	 {
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.google.com/");
			WebElement we = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
			we.click();
			Thread.sleep(3000);
			we.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
	 }
	 
	 
	 public static void workingIframe() 
	 {
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.google.com/");
			WebElement we = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
			we.click();
			driver.switchTo().frame("app");
			driver.findElement(By.xpath("//span[@class='Rq5Gcb' and @data-text='Maps']")).click();
			
	 }
	
	

}
