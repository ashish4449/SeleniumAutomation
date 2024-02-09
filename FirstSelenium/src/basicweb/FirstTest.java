package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();	
		d.get("https://www.amazon.in");
		Thread.sleep(3000);
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		d.findElement(By.id("nav-search-submit-button")).click();
	}

}
