package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
	//	ChromeOptions opt = new ChromeOptions();
	//	opt.addArguments("incognito");
		//launch chrome
 // 	ChromeDriver driver = new ChromeDriver(opt);
		EdgeDriver driver = new EdgeDriver();
		//maximize window
		driver.manage().window().maximize();
		//load URL
		driver.get("https://www.amazon.in");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//choose the item from result
		Thread.sleep(3000);
		String result = driver.findElement(By.xpath("//span[contains(text(), 'results for')]")).getText();
		System.out.println(result+" Bags for boys");
		//select 2 brands
	//	driver.findElement(By.xpath("//div[@id='brandsRefinements']//ul//span/span[2]")).click();
		WebElement brand1 = driver.findElement(By.xpath("(//div[contains(@class, 'a-checkbox-fancy')]//input)[2]"));
		driver.executeScript("arguments[0].click()", brand1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class, 'a-checkbox-fancy')]//input)[2]")).click();
		//driver.findElement(By.xpath("//div[@id='brandsRefinements']//ul//span/span[3]")).click();
		//sort by new arrivals
		driver.findElement(By.xpath("//span[contains(text(), 'Featured')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Newest Arrivals')]")).click();
		//print first resulting bag info
		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("//div[@data-cy='title-recipe']//h2/span")).getText();
		String details = driver.findElement(By.xpath("//div[@data-cy='title-recipe']/a/h2/span")).getText();		
		System.out.println("the product name is: "+name);
		System.out.println("the product detail is: "+details);
		//page Title
		String title = driver.getTitle();
		System.out.println("the title is: "+title);
		//close browser
		//driver.close();
	}
}
