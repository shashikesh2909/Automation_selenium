package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutionScrolling {

	public static void main(String[] args) throws InterruptedException
	{
		hiddenWebElement();
	}
	
	public static void scroll() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		for(int i=0 ;i<2 ;i++)
		{
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(500);
		}
	}
	
	public static void scrollTill() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		
		WebElement we = driver.findElement(By.xpath("//p[text()='Privacy']"));
		Rectangle rect = we.getRect() ;
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		int x = rect.getX();
		int y = rect.getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public static void scrollIntoView() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		
		WebElement we = driver.findElement(By.xpath("//p[text()='Privacy']"));
		Rectangle rect = we.getRect() ;
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].scrollIntoView(true)",we);
	}
	
	public static void handleDisabledWebElement() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		Thread.sleep(1000);
		js.executeScript("document.getElementById('name').value='Shashikesh Kumar'");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('email').value='Shashikesh95@gmail.com'");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('password').value='123456'");
	}
	
	public static void hiddenWebElement() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php");
		
		WebElement hidden = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='Transgender'",hidden);
	}
	
	
	
}

