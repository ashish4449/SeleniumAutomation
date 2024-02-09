package pract4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pract4 {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();

		d.get("https://rahulshettyacademy.com/angularpractice/");

		d.findElement(By.xpath("(//input[@name='name'])")).sendKeys("Test Name");

		d.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmai.com");

		d.findElement(By.id("exampleInputPassword1")).sendKeys("test1234");

		d.findElement(By.id("exampleCheck1")).click();

		WebElement Gender = d.findElement(By.id("exampleFormControlSelect1"));

		Select Sect = new Select(Gender);

		Sect.selectByVisibleText("Female");

		d.findElement(By.id("inlineRadio1")).click();

		d.findElement(By.xpath("(//input[@name=\"bday\"])")).sendKeys("06261996");

		d.findElement(By.cssSelector(".btn.btn-success")).click();

		System.out.println(d.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}
}
