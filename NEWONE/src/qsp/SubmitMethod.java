package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		driver.findElement(By.cssSelector("button[id='user_login_btn']")).submit();
		Thread.sleep(5000);
		driver.close();
	}
}
