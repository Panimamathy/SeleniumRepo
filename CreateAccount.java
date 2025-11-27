package week2.day2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(Options);
		driver.get(" http://leaftaps.com/opentaps/.");
		
		        //Step2: Maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
				//Step3: Enter the user name
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//Step4: Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Step5: Click the button
				driver.findElement(By.className("decorativeSubmit")).click();
				//Step6:Click crmsfa
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Sep7:Click account
				driver.findElement(By.linkText("Accounts")).click();
				//Step8:Create account
				driver.findElement(By.linkText("Create Account")).click();
				//Step9:Enter Account name
				WebElement Display = driver.findElement(By.id("accountName"));
				Display.sendKeys("Panima Automation Account1");
				//Step10:Description
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				//Step11:select Industry
				WebElement industry = driver.findElement(By.name("industryEnumId"));
				Select indusdrop = new Select(industry);
				driver.findElement(By.xpath("//option[text()='Aerospace']")).click();
				//Step12:Ownership
				WebElement Owner = driver.findElement(By.name("ownershipEnumId"));
				Select Ownership = new Select(Owner);
				//driver.findElement(By.xpath("//option[text()='S-Corporation']")).click();
				Ownership.selectByVisibleText("S-Corporation");
				//Step13:Employee
				WebElement Source = driver.findElement(By.name("dataSourceId"));
				Select Employee = new Select(Source);
				Employee.selectByValue("LEAD_EMPLOYEE");
				//Step14:Marketing
				WebElement Market = driver.findElement(By.id("marketingCampaignId"));
				Select Campagin = new Select(Market);
				Campagin.selectByIndex(7);
				//Step15:State
				WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select Province = new Select(State);
				Province.selectByValue("TX");
				//Step16:Click button
				driver.findElement(By.className("smallSubmit")).click();
				//Step17:Verify
				WebElement Verify = driver.findElement(By.xpath("//span[contains(text(),'Panima')]"));
				String displayedName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();

		        if (displayedName.contains("Panima Automation Account1")) {
		            System.out.println("Account created successfully: " + displayedName);
		        } else {
		            System.out.println("Account name mismatch.");
		        }

		        // Close the browser
		        driver.close();
	
}
 }