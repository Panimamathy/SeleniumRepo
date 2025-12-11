package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableErail {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr/td[2]"));
		List<String> trainName = new ArrayList<String>();

		for (int i = 2; i < elements.size(); i++) {
			List<WebElement> trainNames = driver.findElements(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr[\" + i + \"]/td[2]"));
		    String text = trainNames.get(i).getText();
		    System.out.println(text);
		   
		}

		Set<String> unique = new HashSet<>(trainName);
		if(unique.size()==trainName.size()) {
			System.out.println("No duplicates");
		}else {
			System.out.println("Duplicates exist");
		}
			
			
		}
		

	}


