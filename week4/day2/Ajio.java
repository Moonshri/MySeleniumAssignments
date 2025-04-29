package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search Ajio']"));
		Actions a = new Actions(driver);
		a.sendKeys(search, "bags").perform();  //use actions to enter bags in search box
		a.sendKeys(Keys.ENTER).perform();  // use actions to press enter 
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(), 'Men')]"));
		driver.executeScript("arguments[0].click()", gender);
		Thread.sleep(1000); 
		WebElement variety = driver.findElement(By.xpath("//label[contains(text(), 'Fashion Bags')]"));
		driver.executeScript("arguments[0].click()", variety);
		String itemsFound = driver.findElement(By.xpath("//div[@class='filter']//strong")).getText();
		System.out.println("The items found is: "+itemsFound);
		//get brands of the products listed
		driver.findElement(By.xpath("//span[contains(text(), 'brands')]")).click();
		Thread.sleep(2000);
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(brands.size());
		for (WebElement mybrand : brands) {
			System.out.println(mybrand.getText());	
		}
		//list of the laptop names
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println(names.size());
		for (WebElement myname : names) {
			System.out.println(myname.getText());	
		}
		
		
		
		
	}
}
