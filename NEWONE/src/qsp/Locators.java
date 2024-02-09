package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.get("file:///C:/Users/waghm/Desktop/demo.html");
	d.findElement(By.id("a1")).click();
	Thread.sleep(5000);
	d.close();
}
}
