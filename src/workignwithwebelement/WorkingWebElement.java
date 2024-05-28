package workignwithwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWebElement {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin123");
		driver.findElement(By.name("password")).click();
		System.out.println(driver.findElement(By.xpath("//img[@alt='company-branding']")).getText());
		System.out.println(driver.findElement(By.xpath("//img[@alt='company-branding']")).getTagName());
		System.out.println(driver.findElement(By.xpath("//img[@alt='company-branding']")).getSize());
		System.out.println(driver.findElement(By.xpath("//img[@alt='company-branding']")).getAttribute("company-branding"));
		System.out.println(driver.findElement(By.name("username")).getCssValue("color"));
		System.out.println(driver.findElement(By.name("username")).isDisplayed());
		System.out.println("isDisplayed : " + driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed());
		System.out.println("isEnabled : " + driver.findElement(By.name("password")).isEnabled());

	
		driver.navigate().to("https://designsystem.digital.gov/components/checkbox/");
		System.out.println("isSelected : " + driver.findElement(By.xpath("(//label[text()='Frederick Douglass'])[1]")).isSelected());
		System.out.println("isSelected : " + driver.findElement(By.xpath("(//label[text()='Frederick Douglass'])[1]")).getLocation());
		
		
		System.out.println("Height : " + driver.findElement(By.xpath("(//label[text()='Frederick Douglass'])[1]")).getRect().getHeight());
		System.out.println("Width : " + driver.findElement(By.xpath("(//label[text()='Frederick Douglass'])[1]")).getRect().getWidth());
		System.out.println("X axis : " + driver.findElement(By.xpath("(//label[text()='Frederick Douglass'])[1]")).getRect().getX());
		System.out.println("Y axis : " + driver.findElement(By.xpath("(//label[text()='Frederick Douglass'])[1]")).getRect().getY());

		
		driver.navigate().to("https://flipkart.com");
		driver.findElement(By.name("q")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).submit();
		

	}

}
