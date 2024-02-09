package pract4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class P2 {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		d.findElement(By.id("name")).sendKeys("Ashish");
		
		d.findElement(By.id("confirmbtn")).click();
		
		d.switchTo().alert().accept(); 
		
		
		
		
	}
}
