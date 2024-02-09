package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) 
{
	        WebDriver d = new ChromeDriver();
	        d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[.='Login ']")).click();
        int i = 0;
        while (i<1000) {
			try {
				d.findElement(By.id("logoutLink")).click();
				break;
			} catch (Exception e) {
				i++;
			}
		}
        d.close();     
}
}
