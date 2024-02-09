package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//listBox / Dropdown / Combobox 
/*luanch browser
 * maximize
 * facebook navigate
 * click on creat new account
 * select D.O.B
 * close the browser
 */
public class ListBox  {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(3000);
	//by index
	WebElement day = driver.findElement(By.id("day"));
	Select s= new Select(day);
	s.selectByIndex(13);
	Thread.sleep(3000);
	//by visibleText
	WebElement month = driver.findElement(By.id("month"));
	Select m = new Select(month);
	m.selectByVisibleText("Feb");
	Thread.sleep(3000);
	//by value
	WebElement year = driver.findElement(By.id("year"));
	Select y= new Select(year);
	y.selectByValue("2000");
	Thread.sleep(3000);
	driver.close();
	

}
}
