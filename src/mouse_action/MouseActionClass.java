package mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionClass {

	public static void main(String[] args) throws InterruptedException 
	{
		actionsDragAndDrop();
	}
	
	
	public static void ActionMethods()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		Actions act = new Actions(driver) ;
		WebElement we = driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
		//moveToElement(WebElement) & .perform() ----------------------------------------------------------
		act.moveToElement(we).perform();
	}
	
	
	public static void ActionsContextClick()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		
		Actions act = new Actions(driver) ;
		WebElement we = driver.findElement(By.id("btn30"));
		//contextClick (rightClick) --------------------------------------------------------
		act.contextClick(we).perform();	
	}
	
	public static void actionsDoubleClick()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		
		Actions act = new Actions(driver) ;
		WebElement we = driver.findElement(By.id("btn20"));
		//doubleClick (rightClick) --------------------------------------------------------
		act.doubleClick(we).perform();	
	}
	
	public static void actionsClickAndHold() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		Actions act = new Actions(driver) ;
		WebElement we = driver.findElement(By.id("circle"));
		act.clickAndHold(we).perform();
		Thread.sleep(1000);
		act.release(we).perform();		
	}
	
	
	public static void actionsDragAndDrop() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		
		Actions act = new Actions(driver) ;
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));

		act.dragAndDrop(drag,drop).perform();
	}

}
