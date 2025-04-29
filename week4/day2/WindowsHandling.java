package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		WindowsHandling WH = new WindowsHandling();
		WH.windowsHandle();
	}

	void windowsHandle() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
	ChromeDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//login testleaf
	driver.findElement(By.id("username")).sendKeys("DemoCsr");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	//click on image
	driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
	//click on contacts tab
	driver.findElement(By.xpath("//a[(text()='Contacts')]")).click();
	//click on merge contacts
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	//from contact
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	// switch to new window
	Thread.sleep(1000);
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> windows = new ArrayList<String>(windowHandles);
	driver.switchTo().window(windows.get(1));  // switch to new window
	//select first row contact 
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[contains(@class, '-grid3-col-partyId')]/a")).click();
	//to contact
	driver.switchTo().window(windows.get(0)); // go back to main tab
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	
	//select first row contact 
	Thread.sleep(1000);
	Set<String> windowHandles1 = driver.getWindowHandles(); // create list again, as the windows opened again newly
	List<String> windows1 = new ArrayList<String>(windowHandles1);
	driver.switchTo().window(windows1.get(1));  // switch to new window
	driver.findElement(By.xpath("(//div[contains(@class, '-grid3-col-partyId')]/a)[2]")).click();
	
	//click merge button
	driver.switchTo().window(windows1.get(0));  // go back to main tab
	driver.findElement(By.className("buttonDangerous")).click();
	
	
	//accept Alert
	driver.switchTo().alert().accept();
	
	//get page title
	System.out.println("the page title is: "+driver.getTitle());
			
	}
	
	
	
}
