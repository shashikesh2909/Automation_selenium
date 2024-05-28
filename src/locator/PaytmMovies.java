
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
		driver.get("https://paytm.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733295/1626259710574.png']")).click();
		driver.findElement(By.xpath("//div[text()='Delhi/NCR']")).click();
		driver.findElement(By.xpath("//img[@alt='Furiosa: A Mad Max Saga']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
	}
}
