package launch_browser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingChromeBrowser 
{
	static WebDriver driver ;
	static Scanner sc = new Scanner(System.in) ;
	public static void main (String [] args)
	{
		System.out.println("Please enter which browser to open chrome/Edge/Firefox");
		String s = sc.next();
		
		if(s.equalsIgnoreCase("chrome"))     
		{
			driver = new ChromeDriver() ;
		}
		else if (s.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver() ;
		}
		else if(s.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
	}
}
