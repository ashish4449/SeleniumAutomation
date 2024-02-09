package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://www.saucedemo.com/");
	d.findElement(By.id("user-name")).sendKeys("standard_user");
	d.findElement(By.id("password")).sendKeys("secret_sauce");
	d.findElement(By.id("login-button")).click();
	d.findElement(By.xpath("//option[.='Price (low to high)']")).click();
	/*WebElement price = d.findElement(By.className("product_sort_container"));
	Select product= new Select(price);*/
	Thread.sleep(3000);
	//product.selectByIndex(2);
	Thread.sleep(3000);
	d.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")).click();
	d.findElement(By.className("shopping_cart_link")).click();
	Thread.sleep(3000);
	d.findElement(By.id("checkout")).click();
	
	Thread.sleep(3000);
	d.findElement(By.id("first-name")).sendKeys("naruto");
	d.findElement(By.id("last-name")).sendKeys("uzumaki");
	d.findElement(By.id("postal-code")).sendKeys("400068");
	Thread.sleep(3000);
	
	d.findElement(By.id("continue")).click();
	d.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div")).getText();
	Thread.sleep(5000);
	d.findElement(By.id("finish")).click();
	Thread.sleep(3000);
	d.close();
}
}
