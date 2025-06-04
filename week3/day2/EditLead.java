package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead{

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver(); // launch browser
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Demosalesmanager 	crmsfa
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); //wait 10s till the new page loads
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']"))); // to confirm if new page loaded
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // wait 5 seconds for elements
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Moon");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MK");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("moon");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("dept");
		WebElement desc = driver.findElement(By.id("createLeadForm_description"));
		desc.sendKeys("description is this.");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("primary@email.com");
		WebElement stateField = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));//dropdown
		Select state = new Select(stateField);
		state.selectByVisibleText("Alaska");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Actions a = new Actions(driver); //to use keyboards for ctrl+a, ctrl+x, ctrl+v
		WebElement descript = driver.findElement(By.id("updateLeadForm_description"));
		WebElement impNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		descript.clear();
		a.moveToElement(descript).click().sendKeys("new notes");
		a.keyDown(Keys.CONTROL).sendKeys("a","x");
		a.moveToElement(descript).click().keyDown(Keys.CONTROL).sendKeys("v");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sectionHeaderTitle_leads"))); // to confirm if new page loaded
		String title ="View Lead | opentaps CRM";
		String titlePresent = driver.getTitle();
		System.out.println(titlePresent);
		if(titlePresent.equals(title))
				System.out.println("The title is displayed correctly");
		else
			System.out.println("The title is not displayed correctly");
	//	driver.close();

	}

}
