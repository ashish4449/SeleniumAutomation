package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	String url =driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
}
}
