package week5.day2;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		Actions obj = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Conditions of Use & Sale"));
		obj.scrollToElement(element).perform();
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\Documents\\Scanned Documents\\amazon.png");
		FileUtils.copyFile(screenshot, dest);
				
		

	}

}
