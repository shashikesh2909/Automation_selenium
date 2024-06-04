package assignment_questioons;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLinkedinCLose {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		
		driver.findElement(By.xpath("//div[@class='sc-elhb8j-7 jBOGYb']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		Set<String> s = driver.getWindowHandles();
		
		for (String x : s)
		{
			driver.switchTo().window(x);
			if(driver.getTitle().equals("Zomato | LinkedIn"))
			{
				break ;
			}
		}
		
		driver.close();
	}

}
