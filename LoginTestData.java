package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Username entered successfully");

	}
	public void enterPassword() {
		System.out.println("Password entered successfully");

	}

	public static void main(String[] args) {
		LoginTestData b = new LoginTestData();
		b.enterCredentials();
		b.navigateToHomePage();
		b.enterUsername();
		b.enterPassword();
		

	}

}
