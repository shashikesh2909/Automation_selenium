package webdrivermethod;

import java.util.Scanner;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebDriverMethod 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();		// open the browser 
		driver.get("https://www.amazon.in/");		// open the web url
		driver.manage().window().maximize(); 		// maximizing
		String actualtitle = driver.getTitle();     // getTitle 
		System.out.println(actualtitle);
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if (actualtitle.equalsIgnoreCase(expectedTitle))
		{
		System.out.println("Title is correct title");  
		}
		else
		{
			System.out.println("This is wrong title");
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.flipkart.com/");
		try 
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().forward();
		try 
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.navigate().refresh();
		driver.manage().window().setSize(new Dimension(500,500));
		driver.manage().window().setPosition(new Point(500,500));
		try 
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		driver.switchTo().activeElement().sendKeys("Youtube");

		
		driver.close();
		driver.quit();	
	}
}
