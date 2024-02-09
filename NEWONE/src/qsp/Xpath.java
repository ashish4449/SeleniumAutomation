package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	d.findElement(By.xpath("//a[@role='button' and @ class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(5000);
	d.close();
}
}
