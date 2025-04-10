package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignup {
 @SuppressWarnings("deprecation")
public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[contains(text(), \"Create new account\")]")).click(); //for tag a, when giving "" in xpath use \" \" instead
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Moonshri");
		driver.findElement(By.name("lastname")).sendKeys("Kasi");
		driver.findElement(By.name("reg_email__")).sendKeys("moon@email.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("mypassW@2d");
		driver.findElement(By.xpath("//label[contains(text(), 'Female')]/input[@value='1']")).click();
		WebElement dayField=driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(dayField); 
		day.selectByVisibleText("24"); //Select By Index/Value is also possible-index is the position of it in drop down list, starting from 0;
		WebElement monthField=driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(monthField);
		month.selectByIndex(8); // text is Sep, value is 9, both are strings index is 8 and int
		WebElement yearField=driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(yearField);
		year.selectByValue("1992");
 }
}

