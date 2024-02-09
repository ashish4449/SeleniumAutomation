package pract5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P5 {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] vegiees = { "Brocolli", "Tomato", "Pumpkin", "Apple", "Corn" };

		P5 a = new P5(); // create the object to use the addItem method
		a.addItem(d, vegiees);

		d.findElement(By.cssSelector("img[alt='Cart']")).click();

		d.findElement(By.xpath("//*[@class='action-block'] //button[text()='PROCEED TO CHECKOUT']")).click();

		d.findElement(By.xpath("//input[@class=\"promoCode\"]")).sendKeys("rahulshettyacademy");

		d.findElement(By.xpath("//button[@class=\"promoBtn\"]")).click();

		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));

		String x = d.findElement(By.xpath("//span[@class='promoInfo']")).getText();

		System.out.println(x);

	}

	public void addItem(WebDriver d, String[] vegiees) {
		int j = 0;
		List<WebElement> allProduct = d.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < allProduct.size(); i++) {

			String[] productName = allProduct.get(i).getText().split("-");
			// take out all the name of the products

			List<String> selP = Arrays.asList(vegiees);

			String fullname = productName[0];
			String formattedName = productName[0].trim();

			if (selP.contains(formattedName)) { // add product name which we want to select
				d.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if (j == vegiees.length) {
					break;
				}
			}

		}
	}

}
