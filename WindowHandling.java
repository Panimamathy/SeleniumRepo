package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		// method
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//span[text()='From Contact']//following::img")).click();
		//moved to child window
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> childWindow = new ArrayList<String>(windowHandles);
		String string = childWindow.get(1);
		System.out.println(string);
		driver.switchTo().window(string);
		System.out.println("============'");
		driver.findElement(By.xpath("(//div[text()='Contact ID']//following::a[@class='linktext'])[1]")).click();
		driver.switchTo().window(childWindow.get(0));
		System.out.println("-------");
		driver.findElement(By.xpath("//span[text()='To Contact']//following::img")).click();
		System.out.println("-------");
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1);
		List<String> childWindow2 = new ArrayList<String>(windowHandles1);
		String string2 = childWindow2.get(1);
		driver.switchTo().window(string2);
		System.out.println("-------");
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[3]/a")).click();
		driver.switchTo().window(childWindow2.get(0));
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("======");
		driver.switchTo().window(childWindow2.get(0));
		String adding = driver.getTitle();
		System.out.println("The title of the page is " +adding);
		driver.close();
	}

}
