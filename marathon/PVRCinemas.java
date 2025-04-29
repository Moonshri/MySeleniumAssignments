package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		EdgeDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//load URL
		driver.get("https://www.pvrcinemas.com/");
		//select Chennai
		driver.findElement(By.xpath("//span[@data-pc-section='input']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Chennai')]")).click();
		Thread.sleep(1000);
		//select cinemas
		driver.findElement(By.className("cinemas-inactive")).click();
		// select your theater
		driver.findElement(By.xpath("//span[contains(text(), 'Select Cinema')]")).click();
		//select movie
		Thread.sleep(1000);
		driver.findElement(By.className("p-dropdown-item")).click();
		//select date
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[contains(text(),'Tomorrow')]")).click();
		//select cinema
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']")).click();
		//select timings
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']")).click();
		//click on book
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Submit']/span[contains(text(), 'Book')]")).click();
		//click on accept
		driver.findElement(By.xpath("//button[contains(text(), 'Accept')]")).click();
		//click on available seat
		driver.findElement(By.id("SL.SILVER|E:6")).click();
		//click on proceed after seat selection
		driver.findElement(By.xpath("//button[contains(text(), 'Proceed')]")).click();
		//print seat info
		System.out.println("Seat Informataion is:");
		Thread.sleep(3000);
		String ticketValue = driver.findElement(By.xpath("//div[@class='ticket-value']/p")).getText();
	//	String ticketValue1 =	driver.findElement(By.className("ticket-value")).getText();
		System.out.println(ticketValue);
		String seatNum = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println(seatNum);
		//print grand total
		String gTotal= driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']/h6[2]/span")).getText();
		System.out.println("The grand total is: "+gTotal);
		// click proceed after billing summary
		driver.findElement(By.xpath("//button[contains(text(), 'Proceed')]")).click();
		//close popup
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//div[@class='cross-icon mx-2']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		//print page title
		Thread.sleep(2000);
		String pageTitle = "PVR Cinemas";
		String pageTitleActual = driver.getTitle();
		 System.out.println("expected page title is: "+pageTitle);
        System.out.println("actual page title is: "+pageTitleActual);
        //close brower
        driver.close();
	}

}
