package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		// method
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		// Step1: Launch url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Step2: Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		// Step3: Enter the user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// Step4: Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Step5: Click the button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Step6: Click link
		// driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		// Step7: Click lead
		driver.findElement(By.linkText("Leads")).click();
		// Step8:Create account
		driver.findElement(By.linkText("Create Lead")).click();
		// Step9:Enter Account name
		WebElement name = driver
				.findElement(By.xpath("//input[@class='inputBox']/parent::td//input[@name='companyName']"));
		name.sendKeys("Panima Automation");
		// First name
		driver.findElement(By.xpath("//input[@class='inputBox']/parent::td//input[@name='firstName']"))
				.sendKeys("Panima");
		// last name
		driver.findElement(By.xpath("//input[@class='inputBox']/parent::td//input[@name='lastName']"))
				.sendKeys("Varni");
		// firstname local
		driver.findElement(By.xpath("//input[@class='inputBox']/parent::td//input[@name='firstNameLocal']"))
				.sendKeys("Pani");
		// department
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
		// description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("My Automation");
		// mail id
		driver.findElement(By.xpath("//input[@class='inputBox']/parent::td//input[@name='primaryEmail']"))
				.sendKeys("123abc@gamil.com");
		// State
		WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select Province = new Select(State);
		Province.selectByValue("NY");
		// Click button
		driver.findElement(By.name("submitButton")).click();
		// edit
		driver.findElement(By.linkText("Edit")).click();
		// clear
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		// important note
		driver.findElement(By.name("importantNote")).sendKeys("My World");
		// update
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);

		// close
		driver.close();

	}

}
