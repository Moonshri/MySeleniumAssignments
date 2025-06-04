package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://erail.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("txtStationFrom")).click();
	driver.findElement(By.id("txtStationFrom")).sendKeys("MAS", Keys.ENTER);
	driver.findElement(By.id("txtStationTo")).click();
	driver.findElement(By.id("txtStationTo")).sendKeys("MDU", Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	WebElement trainTable = driver.findElement(By.className("TrainListHeader"));
	List<WebElement> trValue = trainTable.findElements(By.tagName("tr"));
	List<String> trainNames = new ArrayList<String>();
	System.out.println(trValue.size());
	System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'DataTable')]//tr[2]/td[2]/a")).getText());
	//get webelements of trainnames
	List<WebElement> trainName = driver.findElements(By.xpath("//table[contains(@class, 'DataTable')]//tr/td[2]/a"));
	System.out.println("The train name list is: "+trainName);
	System.out.println("The number of trains is: "+trainName.size());
	//make a list of train names
	for(int i=0; i < trainName.size();i++) {
		trainNames.add(trainName.get(i).getText());
	}
	// find duplicate elements in train names
	  Set<String> seen = new HashSet<>();
      Set<String> duplicates = new HashSet<>();

      for (String num : trainNames) {
          if (!seen.add(num)) { // if num value is not added to seen set
              duplicates.add(num);
          }
      }
      System.out.println("The list with duplicates: "+trainNames);
      System.out.println("the count of list with duplicate "+trainNames.size());
      System.out.println("The list without duplicates: "+seen);
      System.out.println("THe count of set without duplicates "+seen.size());
      System.out.println("The duplicate list is"+duplicates);
      System.out.println("The count of duplicate value ia "+duplicates.size());
	}

}
