package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesWorking {

	public static void main(String[] args)
	{
		framesByWebElement();
	}
	
	public static void framesByIndex()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("987654321");
	}
	
	public static void framesById()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("987654321");
		
	}
	
	public static void framesByWebElement()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		
		WebElement we = driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
		driver.switchTo().frame(we);
		driver.findElement(By.id("regEmail")).sendKeys("987654321");
	}

}
