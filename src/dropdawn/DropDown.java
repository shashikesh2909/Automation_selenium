package dropdawn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		staticDropDownOperation();
	}
	
	public static void staticDropDown() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		WebElement dropdown = driver.findElement(By.id("select3"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("China");
		
	//	s.selectByValue("Germany");

	//	s.selectByIndex(3);
	
		// selecting index 1 by 1 interview question 
		for(int i=0 ; i<8;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		
	}
	
	public static void staticDropDownDeselect() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		
		Select s = new Select(dropdown);
		for(int i=0 ; i<s.getOptions().size();i++)
		{
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		s.deselectByIndex(1);
	
		s.deselectByValue("China");
		
		s.deselectByVisibleText("Poland");
		
		s.deselectAll();

//		for(int i=0 ; i<2;i++)
//		{
//			s.deselectByIndex(i);
//			Thread.sleep(1000);
//		}		
	}
	
	
	public static void staticDropDownOperation() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		
		Select s = new Select(dropdown);
		System.out.println(s.isMultiple());
		
		// getOptions------------------------------------------------------------------
		List<WebElement> op = s.getOptions();
		for(WebElement x : op)
		{
			System.out.println(x.getText());
		}
		
		// for selecting the options --------------------------------------------------
		for(int i=0 ; i<4;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		// getFirstSelectedOption()-----------------------------------------------------
		System.out.println(s.getFirstSelectedOption().getText());
		
		
		// getAllSelectedOption()-----------------------------------------------------
		List<WebElement> op1 = s.getAllSelectedOptions();
		for(WebElement x : op1)
		{
			System.out.println(x.getText());
		}
		System.out.println("---------------------");
		//getWrappedElement()---------------------------------------------------------
		System.out.println(s.getWrappedElement().getText());
	}
}
