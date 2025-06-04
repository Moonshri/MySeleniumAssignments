package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
	}

}
