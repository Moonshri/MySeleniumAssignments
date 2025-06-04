package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {
	//action amazon amount in cart not working
	public static void main(String[] args) throws IOException, InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//search for oneplus 9 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		//price of first product
		Thread.sleep(2000);
		WebElement firstProductDetails = driver.findElement(By.xpath("//div[@class='puisg-col-inner']"));
		System.out.println("product price is "+firstProductDetails.findElement(By.xpath("//span[@class='a-price-whole']")).getText());
		// Print the number of customer ratings for the first displayed product.
		System.out.println("rating is: "+firstProductDetails.findElement(By.xpath("(//span[contains(@class,'a-size-base')])[2]")).getText());
		//. Click the first text link of the first image.
		firstProductDetails.findElement(By.xpath("//div[@data-cy='title-recipe']/a")).click();
		//move to child window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winHan = new ArrayList<String>(windowHandles);
		//. Take a screenshot of the product displayed.
		driver.switchTo().window(winHan.get(1));
		Thread.sleep(2000);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Define the destination file
        File destinationFile = new File("C:\\Users\\moons\\OneDrive\\Desktop\\Selenium\\assignments\\screenshot.png");
        // Copy screenshot to the desired location using Apache Commons IO
        FileUtils.copyFile(screenshot, destinationFile);
		//Click the 'Add to Cart' button.
        Actions a = new Actions(driver);
        WebElement elements = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		a.moveToElement(elements).perform();
		driver.executeScript("arguments[0].click()", elements);
	    //Get the cart subtotal and verify if it is correct
		Thread.sleep(5000);
		System.out.println("the price in cart is: "+driver.findElement(By.id("attach-accessory-cart-subtotal")).getText());
		//Close the browser.
	//	driver.close();
	//	driver.quit();
	}
}
