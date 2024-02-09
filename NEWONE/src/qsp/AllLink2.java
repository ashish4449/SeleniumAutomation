package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLink2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> qspiders = driver.findElements(By.xpath("//a"));
		int number = qspiders.size();
	for (int i = 0; i <=number; i++) {
		String link = qspiders.get(i).getText();
		System.out.println(link);
		
	}	
		Thread.sleep(5000);
		driver.close();
	}
}
