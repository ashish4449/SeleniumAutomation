package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	static {
	System.setProperty("webdriver.chrome.drive", "C:\\Users\\yowow\\eclipse-workspace\\NEWONE\\driver\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Thread.sleep(3000);
	driver.get("https://www.amazon.com/ref=nav_logo");
	Thread.sleep(3000);
	driver.close();
}
}
