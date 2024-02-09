package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSoures {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.instagram.com");
	String pagesourece = driver.getPageSource();
	System.out.println(pagesourece);
	driver.quit();
}
}
