package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	
	driver.findElement(By.id("policynumber")).sendKeys("12345"); 
	
	driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
	WebElement month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
	Select m = new Select(month);
	m.selectByVisibleText("Dec");
	WebElement year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
	Select y=new Select(year);
	y.selectByVisibleText("1975");
	driver.findElement(By.linkText("4")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("1234567890");
	Thread.sleep(3000);
	driver.close();
}
}
