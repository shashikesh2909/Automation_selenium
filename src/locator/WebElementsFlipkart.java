package locator;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsFlipkart {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 14",Keys.ENTER);
		List<WebElement> al = driver.findElements(By.xpath("//div[@class='KzDlHZ']")) ; 		
		List<WebElement> al1 = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']")) ; 
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getText() + " " + al1.get(i).getText());
		}
	}
}
