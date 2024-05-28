package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationWorking {

	public static void main(String[] args) 
	{
		method3();
	}
	
	public static void method2()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	
	}
	
	
	
	public static void method1()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//span[text()='SANTOOR']")).click();
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("110006");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement button = driver.findElement(By.xpath("//button[@id='Check']"));
		wait.until(ExpectedConditions.visibilityOf(button));
		button.submit();
	}
	
	public static void method3()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement we = driver.findElement(By.name("q"));
		we.sendKeys("Ananya");
		we.sendKeys(Keys.DOWN);
		we.sendKeys(Keys.ENTER);
		
	}

}
