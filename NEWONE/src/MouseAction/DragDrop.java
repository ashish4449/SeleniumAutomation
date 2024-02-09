package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAS to perform drag and drop actions
public class DragDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement src = driver.findElement(By.xpath("//*[@id=\"block-1\"]/h1"));
		WebElement dest = driver.findElement(By.xpath("//*[@id=\"block-4\"]/h1"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		Thread.sleep(5000);
		driver.close();
		
}
}