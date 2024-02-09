package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	 boolean logo = d.findElement(By.cssSelector("img[alt='Facebook']")).isDisplayed();
	if (logo == true) {
		System.out.println("logo is displayed");
	} else {
System.out.println("logo is not displayed");
	}
	d.close();
}
}
