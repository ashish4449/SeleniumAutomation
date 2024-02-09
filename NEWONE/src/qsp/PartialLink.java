package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	Thread.sleep(5000);
	d.findElement(By.partialLinkText("Forgotten")).click();
	Thread.sleep(3000);
	d.close();
	
}
}
