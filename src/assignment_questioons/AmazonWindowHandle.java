package assignment_questioons;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWindowHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight']")).click();
		
		Set<String> s = driver.getWindowHandles();
		
		for(String x : s)
		{
			driver.switchTo().window(x);
			if(driver.getTitle().equals("Apple iPhone 13 (128GB) - Midnight : Amazon.in: Electronics"))
			{
			break ;
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='submit.add-to-cart'])[2]")).click();
		
	}

}
