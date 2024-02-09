package pract11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement field = d.findElement(By.id("autocomplete"));
		field.sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> lists = d.findElements(By.cssSelector(".ui-menu-item"));
		String city = "India";

		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getText().equals(city)) {
				lists.get(i).click();
				break;
			}
		}
		
	}

}
