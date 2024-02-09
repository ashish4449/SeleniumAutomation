package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAP get all the option cars on print on console
public class GetOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/waghm/Desktop/demo.html");
		
		WebElement allcars = driver.findElement(By.id("cars"));
		Select c= new Select(allcars);
		List<WebElement> alloption = c.getOptions();
		for (WebElement option: alloption) {
			String text = option.getText();
			System.out.println(text);
		}
		driver.close();
	}
}
