package assignment_questioons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AirVistaraTicketBook {

	public static void main(String[] args) throws InterruptedException
	{
		// opening, maximizing, synchronizing the window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// opening and performing the operation 
		driver.get("https://www.airvistara.com/in/en");
		driver.findElement(By.xpath("//span[text()='One Way']")).click();
		driver.findElement(By.name("flightSearchFrom")).sendKeys("Delhi",Keys.ARROW_DOWN,Keys.ENTER,"Patna",Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over calanders everymundo ui-datepicker-current-day ui-datepicker-today']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("passengers")).click();
		driver.findElement(By.xpath("//button[@class=' btn plus_btn']")).click();
		driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
	}

}
