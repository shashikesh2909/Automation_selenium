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
		scrollIntoView();
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
}

