package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		String accName = "Moonacct1";
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
			driver.findElement(By.xpath("//a[contains(text(), 'Accounts')]")).click();
			driver.findElement(By.xpath("//a[contains(text(), 'Create Account')]")).click();
			driver.findElement(By.id("accountName")).sendKeys(accName);
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
			WebElement industryField = driver.findElement(By.name("industryEnumId"));
			Select industry = new Select(industryField);
			industry.selectByVisibleText("Computer Software");
			WebElement ownershipField = driver.findElement(By.name("ownershipEnumId"));
			Select ownership = new Select(ownershipField);
			ownership.selectByVisibleText("S-Corporation");
			WebElement sourceField = driver.findElement(By.name("dataSourceId"));
			Select source = new Select(sourceField);
			source.selectByValue("LEAD_EMPLOYEE");
			WebElement markCampField = driver.findElement(By.name("marketingCampaignId"));
			Select markCamp = new Select(markCampField);
			markCamp.selectByIndex(6);
			WebElement provinceField = driver.findElement(By.name("generalStateProvinceGeoId"));
			Select state = new Select(provinceField);
			state.selectByValue("TX");
			driver.findElement(By.className("smallSubmit")).click();
			String acctName = driver.findElement(By.xpath("//table[@class='fourColumnForm']//td[2]/span")).getText();
			
	if(acctName.contains(accName))
	{
		System.out.println("valid account name");
	}
	else
		System.out.println("invalid");
	driver.close();
	}
}
