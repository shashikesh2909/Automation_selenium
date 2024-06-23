package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ParticularWebElement();
	}
	
	public static void fullScreenshot() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com");
		
		Thread.sleep(2000);
		TakesScreenshot t = (TakesScreenshot) driver ;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./TakesScreesnhot/ss1.png");
		Files.copy(src, dest);
		driver.quit() ;
	}
	
	
	public static void ParticularWebElement() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com");
		
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.xpath("//img[@alt='Order Online']"));
		File src = we.getScreenshotAs(OutputType.FILE);
		File dest = new File("./TakesScreesnhot/ss2.png");
		Files.copy(src, dest);
		driver.quit() ;
	}
}
