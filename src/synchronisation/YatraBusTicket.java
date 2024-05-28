package synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class YatraBusTicket {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//a[@title='Buses']")).click();
		
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.xpath("//input[@name='bus_leaving']"));
		we.click();
		Thread.sleep(500);
		we.sendKeys("manali");
		Thread.sleep(500);
		we.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		we.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		WebElement w2 = driver.findElement(By.xpath("//input[@name='bus_dest']"));
		w2.click();
		w2.sendKeys("sonipat");
		Thread.sleep(500);
		w2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		w2.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='BE_bus_search_btn']")).click();
		
		
		
		
		
	}
}