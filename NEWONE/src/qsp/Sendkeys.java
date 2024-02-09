package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	d.findElement(By.id("email")).sendKeys("automation");
	Thread.sleep(2000);
	d.findElement(By.id("pass")).sendKeys("automation");

	Thread.sleep(5000);
   
	d.close();
}
}
