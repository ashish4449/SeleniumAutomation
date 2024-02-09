package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/waghm/Desktop/page.html");
		driver.findElement(By.id("t1")).sendKeys("Q");
		WebElement frame = driver.findElement(By.id("f1"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("t2")).sendKeys("J");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("s");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("s");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("p");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("p");
		Thread.sleep(3000);
		driver.close();
}
}