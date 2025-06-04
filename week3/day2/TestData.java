package week3.day2;

public class TestData {
	public void enterCredentials(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		TestData td=new TestData();
		td.enterCredentials("enter credentials");
		td.navigateToHomePage();

	}
	public void navigateToHomePage()
	{
		System.out.println("navigate to home page");
	}
}
