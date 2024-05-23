package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class WorkingWithLocaror {

	public static void main(String[] args) throws InterruptedException 
	{
		
		workingWithClassName();
	}
	
	public static void tag_name()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:flipkart.com/");
		driver.findElement(By.tagName("input")).sendKeys("Books",Keys.ENTER);
	}
	
	
	public static void workingWithID()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:fb.com/");
		driver.findElement(By.id("email")).sendKeys("",Keys.ENTER);
		driver.findElement(By.id("pass")).sendKeys("",Keys.ENTER);
		driver.findElement(By.id("u_0_c_Z4")).sendKeys(Keys.ENTER);
	}
	
	public static void workingWithname()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:instagram.com/");
		driver.findElement(By.name("email")).sendKeys("9582243211",Keys.ENTER);
		driver.findElement(By.name("pass")).sendKeys("1234",Keys.ENTER);
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	}
	
	public static void workingWithClassName() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:instagram.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("9582243211");
		driver.findElement(By.name("password")).sendKeys("xyz123456789");
		driver.findElement(By.className("_acap")).click();
	}

}
