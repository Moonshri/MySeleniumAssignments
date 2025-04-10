package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) {
	//	ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Demosalesmanager 	crmsfa
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Moon");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MK");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.name("submitButton")).click();
		String actualTitle ="View Lead | opentaps CRM";
		String titlePresent = driver.getTitle();
		System.out.println(titlePresent);
		if(titlePresent.contains(actualTitle))
				System.out.println("The title is displayed correctly");
		else
			System.out.println("The title is not displayed correctly");
		driver.close();
		
		
		
		
		
	}
}
