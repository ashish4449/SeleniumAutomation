package Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* WAS to handela AuntheticationPopup*/
public class AuntheticationPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		d.get("admin:admin@https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		d.close();
		
		
	}
}
