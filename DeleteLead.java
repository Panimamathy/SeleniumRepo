package week3.day2;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.MapReduceCommand.OutputType;

public class DeleteLead {

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
		//Step8: Click Find lead
		driver.findElement(By.linkText("Find Leads")).click();
		//Step9: Click phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Step11: enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
		//Step10: Click find lead
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//step11: capture the lead
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[text()='Lead ID']//following::a[@class='linktext'])[1]")).getText();
		System.out.println(text);
		//Click the first lead
		driver.findElement(By.xpath("(//div[text()='Lead ID']//following::a[@class='linktext'])[1]")).click();
		//click the delete button
		driver.findElement(By.linkText("Delete")).click();
		//click lead again
		driver.findElement(By.linkText("Find Leads")).click();
		//enter lead id
		driver.findElement(By.name("id")).sendKeys(text);
		//click find lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		Thread.sleep(5000);
		if(text2.equals("No records to display")) {
			System.out.println("Lead is deleted");
		}else 
		{
			System.out.println("Lead Not deleted");
			}
	//	driver.close();
		
		
		
	}

}
