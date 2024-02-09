package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("naruto");
	driver.findElement(By.name("lastname")).sendKeys("uzumaki");
	driver.findElement(By.name("reg_email__")).sendKeys("8645157891");
	driver.findElement(By.id("password_step_input")).sendKeys("Zxcvbnmm");
	
	//by index
	WebElement day = driver.findElement(By.id("day"));
	Select s= new Select(day);
	s.selectByIndex(13);
	
	//by visibleText
	WebElement month = driver.findElement(By.id("month"));
	Select m = new Select(month);
	m.selectByVisibleText("Feb");
	
	//by value
	WebElement year = driver.findElement(By.id("year"));
	Select y= new Select(year);
	y.selectByValue("2000");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[.='Male']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("websubmit")).click();
	driver.close();
	
}

}
