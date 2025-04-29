package week4.day1;

public class LoginPage extends BasePage {

	public static void main(String[] args) {
		LoginPage Login = new LoginPage();
		Login.findElement("TestLeaf");
		Login.clickElement("TestLeaf");
		Login.enterText("TestLeaf");
		Login.performCommonTasks("TestLeaf");


	}

	
	public void findElement(String s) {
		super.findElement("TestLeaf");
		System.out.println("Find elements in "+s+" login page");
	}

	public void clickElement(String s) {
		super.clickElement("TestLeaf"); 
		System.out.println("Click elements in "+s+" login page");
	}

	public void enterText(String s) {
		super.enterText("TestLeaf");
		System.out.println("Enter Text in "+s+" login page");
	}

	public void performCommonTasks(String s) {
		super.performCommonTasks("TestLeaf");
		System.out.println("Perform Common Tasks in "+s+" login page");
	}
}
