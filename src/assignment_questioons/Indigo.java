package assignment_questioons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Indigo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.goindigo.in/flight-booking.html");
		WebElement we = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(1000);
		we.clear();
		we.sendKeys("Delhi");
		Actions act = new Actions(driver) ;
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Indira Gandhi International Airport']"))).click();
	}

}
