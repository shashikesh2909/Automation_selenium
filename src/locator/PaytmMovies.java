
package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaytmMovies 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");

		Actions act = new Actions(driver) ;
		
		driver.findElement(By.xpath("//a[text()='Paytm for Consumer']")).click();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Payments']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Bill Payment & Recharges']"))).perform();
		act.click().perform();
	}
}
