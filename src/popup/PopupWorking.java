package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupWorking {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		javaexecutorWindowFileuploadRobotPopup();
	}
	
	public static void javaexecutorAlertPop() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
	}
	
	public static void javaexecutorConfirmPopup() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		driver.findElement(By.id("buttonAlert5")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.quit();
	}
	
	public static void javaexecutorPromptPopup() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.findElement(By.id("buttonAlert1")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("yes");
		a.accept();
		System.out.println(a.getText());
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	public static void javaexecutorNotificationPopup() throws InterruptedException, AWTException
	{
		ChromeOptions opt = new ChromeOptions() ;
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		
		/* 
		 using the robot class 
		 
		Thread.sleep(2000);				
		Robot r = new Robot() ;
		r.keyPress(KeyEvent.VK_TAB)	;	
		r.keyPress(KeyEvent.VK_TAB)	;
		r.keyPress(KeyEvent.VK_TAB)	;
		r.keyPress(KeyEvent.VK_ENTER) ;	
		
		r.keyRelease(KeyEvent.VK_TAB)	;	
		r.keyRelease(KeyEvent.VK_TAB)	;	
		r.keyRelease(KeyEvent.VK_TAB)	;			
		r.keyRelease(KeyEvent.VK_ENTER) ;
		*/
	}
	
	
	public static void javaexecutorAuthenticationPopup() throws InterruptedException, AWTException
	{
		ChromeOptions opt = new ChromeOptions() ;
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		driver.quit();
	}
	
	
	public static void javaexecutorWindowFileSenkeysPopup() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		WebElement we = driver.findElement(By.id("fileInput"));
		Thread.sleep(3000);
		we.sendKeys("C:\\Users\\shash\\Downloads\\IMG20240521110905.jpg");
	}
	
	
	public static void javaexecutorWindowFileuploadRobotPopup() throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=11496&wExp=N");
		driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']")).click();
	
		
		Thread.sleep(2000);
		StringSelection path = new StringSelection("C:\\Users\\shash\\Downloads\\DEFECT LIFE CYCLE NOTES.docx") ;
		
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(path, null);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
