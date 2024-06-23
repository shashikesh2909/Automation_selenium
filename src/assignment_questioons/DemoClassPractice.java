package assignment_questioons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoClassPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		JavaScriptExecutorWorking();
	}
	
	/*
	 working with drop downs 
	 There are two type of drop dawns
	 1) Static drop down 
	 2) Dynamic drop down 
	 
	 STATIC DROP DOWN : This drop down have the fixed options and can accessed using Select class.
	 
	 1. selection methods 
	 	a. selectByIndex()
	 	b. selectByValue()
	 	c. selectByVisibleText()
	 	
	 2. Deselection methods
	 	a. deselectByIndex()
	 	b. deselectByValue()
	 	c. deselectByVisibleText()
	 	d. deselecAll()
	 	
	 3. optional methods
	 	a. isMultiple()
	 	b. getOptions()
	 	c. getAllSelectedOption()
	 	d. getWrappedElement
	 	e. getFirstSelectedOption()
	 
	 */
	
	public static void singleSelectWorking()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		WebElement dd = driver.findElement(By.xpath("//select[@id=\"select3\"]"));
		dd.click();
		Select s = new Select(dd);
		s.selectByIndex(5);
		s.selectByValue("China");
		s.selectByVisibleText("Germany");
	}
	
	
	public static void multiSelectWorking()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement dd = driver.findElement(By.xpath("//select[@id='select-multiple-native']"));
		dd.click();
		Select s = new Select(dd);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		s.selectByIndex(4);
		
		s.deselectByIndex(1);
		
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println(s.getWrappedElement().getText());
		List<WebElement> l = s.getOptions();
		for (WebElement x : l)
		{
			System.out.println(x.getText());
		}
		List<WebElement> l1 = s.getAllSelectedOptions();
		for (WebElement x : l1)
		{
			System.out.println(x.getText());
		}
		System.out.println(s.isMultiple());
	}
	
	/*
	 Actions Class : used to perform the different mouse actions
	 1. moveToElement(WebElement) : Move to a particular web element and returns actions interface
	 2. perform() : mandatory method which needs to be added to perform the action and return type is void
	 3. click() / click(WebElement) : click on a particular web element 
	 4. clickAndHold(WebElement) : click and hold on a particular web element
	 5. dragAndDrop(source , destination) : drag element from one position to second position 
	 6. contextClick() / contextClick(WebElement) : used to perform the right click and returns Actions interface
	 7. release() : use to release the 
	 */
	
	
	public static void ActionsWorking() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[text()='Right Click']"))).contextClick().perform();
		
		Thread.sleep(2000);
		driver.navigate().to("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		act.clickAndHold(driver.findElement(By.xpath("//div[@class='zoom-button ']"))).perform();
		
		Thread.sleep(2000);
		driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		act.dragAndDrop(driver.findElement(By.xpath("//div[text()='Mobile Charger']")), driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"))).perform();
	}
	
	
	/* JavaScriptExecutor : this is an interface which is used to execute the java script code which we are using for following functions 
	 	1. scroll up down left right on the page 
	 	2. access the hidden web element on a page
	 	3. access the disabled web element on a page
	 	
	 */
	
	public static void JavaScriptExecutorWorking()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://Zomato.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,500)");
	}

}
