package assignment_questioons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpotifyPlaylist {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://open.spotify.com/");
		driver.findElement(By.xpath("//button[@data-testid='login-button']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("shashikesh95@gmail.com",Keys.TAB,"Delhi123456",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(5000);
	
		Actions act = new Actions(driver);
		WebElement pl = driver.findElement(By.xpath("//button[@aria-label='Create playlist or folder']"));
		Thread.sleep(1000);
		act.moveToElement(pl).click().perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Create a new playlist']"))).click().perform();
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for songs or episodes']"));
		Thread.sleep(1000);
		search.click();
		search.sendKeys("Pawan singh",Keys.ENTER);
		driver.findElement(By.xpath("(//button[text()='Add'])[1]")).click();
		Thread.sleep(1000);
		WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search for songs or episodes']"));
		Thread.sleep(2000);
		search1.click();
		search1.clear();
		Thread.sleep(1000);
		search1.sendKeys("khesari yadav",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Add'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='eSg4ntPU2KQLfpLGXAww']/descendant::button[@data-testid='play-button']")).click();


	}

}
