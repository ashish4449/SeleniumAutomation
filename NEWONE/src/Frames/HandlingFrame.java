package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to handl frame
public class HandlingFrame {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/waghm/Desktop/page.html");
		driver.findElement(By.id("t1")).sendKeys("mumbai");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("bangalore");
		Thread.sleep(3000);
		driver.close();
}
}
