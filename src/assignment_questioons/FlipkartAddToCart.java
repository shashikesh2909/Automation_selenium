package assignment_questioons;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddToCart {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
		
		Set<String> s = driver.getWindowHandles();
		
		for(String x : s)
		{
			driver.switchTo().window(x);
			if(driver.getTitle().equals("Apple iPhone 15 (Blue, 128 GB)"))
			{
				break ;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		
	}

}
