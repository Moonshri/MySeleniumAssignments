package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys(" testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys(" Tuna@321");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//a[contains(text(), \"Find your account and log\")]")).click();
		String title = driver.getTitle();
		String titleActual = "Forgotten Password | Can't Log In | Facebook";
		System.out.println(title);
		if(title.contains(titleActual))
			System.out.println("The correct web page is loaded");
		else
			System.out.println("The incorrect web page is loaded");
	}

}
