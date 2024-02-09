package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P2 {
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
		c.deselectByIndex(1);
		c.deselectByIndex(0);
		c.deselectByValue("audi");
		c.deselectByVisibleText("BMW");
		Thread.sleep(3000);
		driver.close();
		
		
	}
}
