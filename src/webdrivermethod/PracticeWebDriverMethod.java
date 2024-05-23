package webdrivermethod;

import java.util.Scanner;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeWebDriverMethod {
	
	static WebDriver driver ;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the valid url to lanch the application : ");
		String url = sc.next();
		getUrl(driver,url);
		action(driver);
	}
	public static void action(WebDriver driver)
	{
		System.out.println("What action you want to perform");
		System.out.println("1. Get the title\n2. Get current url\n3. Get source code\n4. maximize the window\n5. minimize window\n6. fullscreen window\n7. customise window size\n8. set window position\n9. navigate to some other url\n10. Take forward\n11. Take back\n12. refresh Page\n13. enter text\n14. close browser ");
		int sel = sc.nextInt();
		if(sel == 1)
		{
			getTitleMethod(driver);
			cont();
		}
		if(sel == 2)
		{
			getCurrentUrl(driver);
			cont();
		}
		if(sel == 3)
		{
			getSourceCodeMethod(driver);
			cont();
		}
		if(sel == 4)
		{
			maximizeWindow(driver);
			cont();
		}
		if(sel == 5)
		{
			minimizeWindow(driver);
			cont();
		}
		if(sel == 6)
		{
			fullscreenWindow(driver);
			cont();
		}
		if(sel == 7)
		{
			setSizeWindow(driver);
			cont();
		}
		if(sel == 8)
		{
			setPositionwindow(driver);
			cont();
		}
		if(sel == 9)
		{
			urlnavigate(driver);
			cont();
		}
		if(sel == 10)
		{
			forwardnavigate(driver);
			cont();
		}
		if(sel == 11)
		{
			backnavigate(driver);
			cont();
		}
		if(sel == 12)
		{
			backnavigate(driver);
			cont();
		}
		if(sel == 12)
		{
			refreshnavigate(driver);
			cont();
		}
		if(sel == 13)
		{
			activeelemetswitchto(driver);
			cont();
		}
		if(sel == 14)
		{
			driver.close();
		}
	}
	
	public static WebDriver browser()
	{
		System.out.println("please select browser: \n1. Chrome \n2. Firefox\n3. Edge");
		int sel = sc.nextInt();
		if(sel == 1)
		{
			driver = new ChromeDriver();
		}
		else if(sel == 2)
		{
			driver = new FirefoxDriver();
		}
		else if (sel == 3)
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid choice");
		}
		return driver;
	}
	public static void getUrl(WebDriver driver , String url)
	{
		browser().get(url);
	}
	
	public static void getTitleMethod(WebDriver driver)
	{
		System.out.println(driver.getTitle());
	}
	
	public static void getCurrentUrl(WebDriver driver)
	{
		System.out.println(driver.getCurrentUrl());
	}
	public static void getSourceCodeMethod(WebDriver driver)
	{
		System.out.println(driver.getPageSource());
	}
	
	public static void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public static void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	public static void fullscreenWindow(WebDriver driver)
	{
		driver.manage().window().fullscreen();
	}
	public static void setSizeWindow(WebDriver driver)
	{
		System.out.println("Enter the width & length");
		int w = sc.nextInt();
		int l = sc.nextInt();
		Dimension d = new Dimension(w,l);
		driver.manage().window().setSize(d);
	}
	public static void setPositionwindow(WebDriver driver)
	{
		System.out.println("Enter the x & y ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Point p = new Point(x,y);
		driver.manage().window().setPosition(p);
	}
	public static void urlnavigate(WebDriver driver)
	{
		System.out.println("Which website want to navigate");
		String url = sc.next();
		driver.navigate().to(url);
	}
	
	public static void forwardnavigate(WebDriver driver)
	{
		driver.navigate().forward();
	}
	public static void backnavigate(WebDriver driver)
	{
		driver.navigate().back();
	}
	public static void refreshnavigate(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	public static void activeelemetswitchto(WebDriver driver)
	{
		driver.switchTo().activeElement().sendKeys("youtube",Keys.ENTER);
	}
	public static void closeapp(WebDriver driver)
	{
		driver.close();
	}
	public static void cont()
	{
		System.out.println("-------------------------------");
		System.out.println("Want to perform any other action Y/N");
		char c = sc.next().charAt(0);
		if (c=='y' || c == 'Y')
		{
			action(driver);
		}
	}
}
