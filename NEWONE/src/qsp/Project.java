package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.get("https://www.youtube.com/");
	d.manage().window().maximize();
	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
	d.navigate().to("https://www.facebook.com");
	Thread.sleep(5000);
	d.navigate().back();
	Thread.sleep(5000);
	d.navigate().forward();
	Thread.sleep(5000);
	d.navigate().refresh();
	Thread.sleep(5000);
	d.close();
	
   
	
}
}
