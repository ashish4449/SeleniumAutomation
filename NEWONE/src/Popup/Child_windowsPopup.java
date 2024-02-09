package Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_windowsPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		Set<String> wind = driver.getWindowHandles();
		for (String s : wind) {
			System.out.println(s);
		}
		driver.quit();
}
}