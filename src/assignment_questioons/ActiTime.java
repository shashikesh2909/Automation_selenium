package assignment_questioons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-6aohfh7/login.do");
		driver.switchTo().activeElement().sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//a[text()='All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		driver.findElement(By.xpath("//input[@onclick='deleteConfirmDlg.close()']")).click();
	}

}
