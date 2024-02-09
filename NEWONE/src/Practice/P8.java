package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P8 {
@Test
public void manager() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();//(//tagname[.='text']
	Thread.sleep(10000);
	driver.close();
}

@Test
public void user() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("trainee");
	driver.findElement(By.name("pwd")).sendKeys("trainee");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();//(//tagname[.='text']
	Thread.sleep(10000);
	driver.close();
}
}
