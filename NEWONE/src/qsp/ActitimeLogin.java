package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
static {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yowow\\eclipse-workspace\\NEWONE\\driver");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();//(//tagname[.='text']
	Thread.sleep(10000);
	driver.close();
	
}
}
