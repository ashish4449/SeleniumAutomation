package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*handling multi select
HTML code for creating a dropdown
WAS to handle multi select dropdown
deselect all option at the time
WAP to get the first selected option from the dropdown
WAS to get first selected option from the dropdown*/
public class DeselectAll {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/waghm/Desktop/demo.html");
		WebElement cars = driver.findElement(By.id("cars"));
		Select c = new Select(cars);
		c.selectByIndex(1);
		Thread.sleep(3000);
		c.selectByValue("audi");
		Thread.sleep(3000);
		c.selectByVisibleText("BMW");
		Thread.sleep(3000);
		c.selectByIndex(0);
		String option = c.getFirstSelectedOption().getText();
		System.out.println(option);
		c.deselectAll();
		Thread.sleep(3000);
		driver.close();
		
		
	}
}

