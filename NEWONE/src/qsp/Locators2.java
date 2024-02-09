package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.instagram.com/");
	Thread.sleep(5000);
	driver.findElement(By.id("a1")).click();
	Thread.sleep(5000);
	driver.close();
}
}
