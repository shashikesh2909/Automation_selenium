package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaytmMovies 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://paytm.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[3]/div/div/div/div[1]/div/div/div")).click();	
	}
}
