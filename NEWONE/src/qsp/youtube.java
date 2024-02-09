package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.youtube.com/");
	Thread.sleep(5000);
	d.findElement(By.name("search_query")).sendKeys("rasiya");
	d.findElement(By.id("search-icon-legacy")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//yt-formatted-string[.='Rasiya - Brahmāstra | Amitabh B | Ranbir Kapoor | Alia Bhatt | Pritam | Amitabh | Tushar | Shreya']")).click();
	Thread.sleep(10000);
	
}
}
