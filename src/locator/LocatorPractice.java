package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorPractice {

	public static void main(String[] args) 
	{
		orangehrm();
	}
	
	public static void fbCreateAccount()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("_6lti")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("firstname")).sendKeys("Shashikesh");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("8700834049");
		driver.findElement(By.name("reg_passwd__")).sendKeys("963258");
		driver.findElement(By.id("u_2_5_fT")).click();
		driver.findElement(By.name("websubmit")).click();
	}

	
	public static void orangehrm()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
}
