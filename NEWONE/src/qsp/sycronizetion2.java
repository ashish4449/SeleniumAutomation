//WAS to sycronize by using explicit wait 
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sycronizetion2 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	//Thread.sleep(3000);
	//System.out.println(driver.getTitle());
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
	wait.until(ExpectedConditions.titleContains("Enter"));
	driver.findElement(By.id("logoutLink")).click();
	driver.close();
	
}
}
