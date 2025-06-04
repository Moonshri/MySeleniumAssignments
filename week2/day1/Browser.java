package week2.day1;

public class Browser {

	public String launchBrowser(String browserName)
	{
	
	System.out.println(browserName+" Browser launched successfully");
	return browserName;
	
	}
	public void loadUrl()
	{
		System.out.println("Application URL loaded successfully");
	}
	public static void main(String[] args) {
	//	String browserName;
		Browser browser = new Browser();
		browser.loadUrl();
		System.out.println("when used calling method");
		browser.launchBrowser("Chrome");
		System.out.println("when used method return");
		System.out.println(browser.launchBrowser("Firefox"));
		
	}

}
