package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Salesforce extends SalesForceParent{
//salesforce view all and search from box is not working, status not getting selected

//also y that remotewebdriver class is opening and it is  not working always
	@Test	
	public void salesForce() throws InterruptedException {
		//login by giving username,password and clicking login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf@2025");
		driver.findElement(By.id("Login")).click();
		//click on toggle menu, search for legal ent in filter and click on legal entities
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//h2[contains(text(),'App Launcher')]/parent::div/following-sibling::div//div//lightning-input//div")).sendKeys("legal entities");
	//	driver.findElement(By.xpath("//b[text()='Legal Entities']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		//click on dropdown in legal entities tab and click new legal entity
		driver.findElement(By.xpath("//span[contains(text(),'Legal Ent')]/parent::a/following-sibling::one-app-nav-bar-item-dropdown")).click();
		WebElement newlegal = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		driver.executeScript("arguments[0].click()", newlegal); 
		//enter companyname,description,status and click save
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//label[contains(text(),'Descript')]/following-sibling::div/textarea")).sendKeys("Salesforces");
		WebElement status = driver.findElement(By.xpath("//label[contains(text(),'Status')]/following-sibling::div//div//div//button"));
		a.moveToElement(status).click().sendKeys(Keys.DOWN, Keys.ENTER).build().perform();
		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
		driver.executeScript("arguments[0].click()", save);
		//get the text of the missed mandatory field
		System.out.println(driver.findElement(By.xpath("//div[@class='fieldLevelErrors']//ul//a")).getText());
	}

}
