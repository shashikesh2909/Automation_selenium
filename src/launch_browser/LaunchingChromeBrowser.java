package launch_browser;

import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingChromeBrowser 
{
	static Scanner sc = new Scanner(System.in) ;
	public static void main (String [] args)
	{
		System.out.println("PLease enter which browser to open chrome/edge");
		String s = sc.next();
		
		if(s.equalsIgnoreCase("chrome"))     
			{
				ChromeDriver cdriver = new ChromeDriver() ;
			}
		else if (s.equalsIgnoreCase("edge"))
		{
			EdgeDriver edriver = new EdgeDriver() ;
			edriver.close();
		}
		
		// i made the modification here again here 
		
	}
}
