package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		//Launch the browser
		driver.get("https://www.facebook.com/");
		//Maximize the window
		driver.manage().window().maximize();
		//Add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		//Click Create account
		driver.findElement(By.linkText("Create new account")).click();
		//Enter First name
		driver.findElement(By.name("firstname")).sendKeys("PANI");
		//Enter last name
		driver.findElement(By.name("lastname")).sendKeys("VARNI");
		//Select date
		WebElement date = driver.findElement(By.id("day"));
		Select dob = new Select(date);
		//Click date
		dob.selectByIndex(2);
		WebElement month = driver.findElement(By.id("month"));
		Select Mon = new Select(month);
		//click month
		Mon.selectByIndex(3);
		WebElement year = driver.findElement(By.id("year"));
		Select birth = new Select(year);
		//Click year
		birth.selectByValue("2002");
		//select radio button
		driver.findElement(By.xpath("//input[@value='1']")).click();
		//enter mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9758291256");
		//enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Pani@123");
	}

}
