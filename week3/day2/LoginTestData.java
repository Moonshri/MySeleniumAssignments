package week3.day2;

public class LoginTestData extends TestData{

	public void enterUserName()
	{
		System.out.println("enter user name");
	}

	public static void main(String[] args) {
		LoginTestData test=new LoginTestData();
		test.enterCredentials("enter the credentials");
		test.navigateToHomePage();
		test.enterUserName();
		test.enterPassword("enter password");		

	}
	public void enterPassword(String s1)
	{
		System.out.println(s1);
	}

}
