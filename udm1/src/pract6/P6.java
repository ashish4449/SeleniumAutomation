package pract6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P6 {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		d.get("https://rahulshettyacademy.com/loginpagePractise/");

		d.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		d.findElement(By.id("password")).sendKeys("learning");

		d.findElement(By.xpath("//input[@value='user']")).click();

		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));

		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		d.findElement(By.id("okayBtn")).click();

		WebElement ele = d.findElement(By.xpath("//select[@class='form-control']"));

		Select sel = new Select(ele);

		sel.selectByValue("consult");

		d.findElement(By.id("terms")).click();

		d.findElement(By.id("signInBtn")).click();

		WebDriverWait v = new WebDriverWait(d, Duration.ofSeconds(5));

		v.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));

		List<WebElement> title = d.findElements(By.xpath("//*[@class='btn btn-info']"));

		for (int i = 0; i < title.size(); i++) {
			title.get(i).click();
		}

		d.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();

	}

}
