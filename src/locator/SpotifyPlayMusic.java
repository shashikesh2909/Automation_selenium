package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifyPlayMusic {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://open.spotify.com/search");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("shashikesh95@gmail.com");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Delhi123456");
		driver.findElement(By.xpath("//span[text()='Log In']")).click();	
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@maxlength='800']")).sendKeys("Parichhawan me");
		driver.findElement(By.xpath("//div[@class='ouEZqTcvcvMfvezimm_J']")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/main/section/div[3]/div[2]/div/div/div/button")).click();

	}
}
