package MouseAction;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAS to perform double click action 

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement target = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		driver.close();
	}
}
