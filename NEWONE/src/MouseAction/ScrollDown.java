package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		int y = driver.findElement(By.xpath("//*[@id=\"page\"]/section[8]/div[1]/div/a/div/div[1]/span")).getLocation().getY();
		j.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
		//j.executeScript("window.scrollBy(0,2000)");
		driver.close();
		
}
}
