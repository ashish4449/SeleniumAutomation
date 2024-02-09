package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	String pagesourece = driver.getPageSource();
	System.out.println(pagesourece);
	driver.quit();
}
}