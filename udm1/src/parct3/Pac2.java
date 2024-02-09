package parct3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Pac2 {
	public static void main(String[] args) {

		WebDriver dd = new ChromeDriver();

		dd.get("https://rahulshettyacademy.com/AutomationPractice/");

		dd.findElement(By.id("checkBoxOption1")).click();

		Assert.assertTrue((dd.findElement(By.id("checkBoxOption1")).isSelected()));

		System.out.println((dd.findElement(By.id("checkBoxOption1")).isSelected()));

		dd.findElement(By.id("checkBoxOption1")).click();

		Assert.assertFalse((dd.findElement(By.id("checkBoxOption1")).isSelected()));

		System.out.println((dd.findElement(By.id("checkBoxOption1")).isSelected()));

		dd.findElements(By.xpath("//*[@type=\"checkbox\"]")).size();

		System.out.println(dd.findElements(By.xpath("//*[@type=\"checkbox\"]")).size());

	}

}
