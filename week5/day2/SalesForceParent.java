package week5.day2;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SalesForceParent {
	
	public EdgeOptions opt;
	public EdgeDriver driver;
	
	@BeforeTest
	public void preCondition() {
		//to disable notifications popup
		opt = new EdgeOptions();
		Map<String,Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2); 
		opt.setExperimentalOption("prefs",prefs); 
		driver = new EdgeDriver(opt);
		//maximize,launch and set implicit wait for salesforce page
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterTest
	public void postCondition() {
		System.out.println("postCondition executed");
		driver.manage().window().minimize();
	//	driver.close();
	}
	
}

