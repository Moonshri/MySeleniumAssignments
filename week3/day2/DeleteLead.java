package week3.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
	//	EdgeDriver driver = new EdgeDriver(); // launch browser
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait 5sec while finding every element in this browser session
		//Demosalesmanager 	crmsfa login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on the image to go into main page
		driver.findElement(By.linkText("CRM/SFA")).click(); // to confirm if new page loaded
		//driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		//go to leads tab
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		WebElement findLeads = driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]"));
		findLeads.click();
		// go to the lead displayed in first row
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr//div/a")).click();
		String id = driver.findElement(By.id("viewLead_companyName_sp")).getText(); //to get Lead ID we are going to delete
		System.out.println(id);
		//  take the generated lead ID from company name
		String[] s1=id.split(" ");
		System.out.println(s1[1]);
		String s2=s1[1].replaceAll("[^0-9]", "");	    
		//   String[] s2 = s1[1].split(")");
		//   String delId = s2[0];
		System.out.println(s2);
		//delete the lead
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(1000); // to avoid stale element exception error
		//check if lead deleted properly
		driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]")).click(); // not using findLeads coz it will give staleelement exception
		driver.findElement(By.name("id")).sendKeys(s2);
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		//Find Leads
		Thread.sleep(1000); // to wait till result page displayed
		String screenResult = driver.findElement(By.className("x-paging-info")).getText();
		//div[@class='x-paging-info']
		System.out.println(screenResult);
		String result = "No records to display";
		if(screenResult.equals(result))
			System.out.println("record deleted");
		else
			System.out.println("record not deleted"); 
	}
}