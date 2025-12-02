package week4.day1;

public class LoginPage extends BasePage{

	public void performCommonTasks() {
		super.performCommonTasks();
		System.out.println("Task completed");

	}
	public static void main(String[] args) {
		LoginPage task = new LoginPage();
		task.performCommonTasks();

	}
}
