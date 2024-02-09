package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup {
	static {
	 	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    }
	    public static void main(String[] args) throws InterruptedException {
	 	        WebDriver d = new ChromeDriver();
				d.manage().window().maximize();
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				d.get("https://demo.actitime.com/login.do");
				d.findElement(By.name("username")).sendKeys("admin");
				d.findElement(By.name("pwd")).sendKeys("manager");
				d.findElement(By.xpath("//div[text()='Login ']")).click();
				d.findElement(By.xpath("//div[.='Tasks']")).click();
				d.findElement(By.xpath("//div[.='Add New']")).click();
				d.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
				d.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("job dedo");
				Thread.sleep(3000);
				d.findElement(By.xpath("//div[.='Cancel' and @class='greyButton cancelBtn']")).click();
				Thread.sleep(3000);
				 Alert s = d.switchTo().alert();
				 s.accept();
				/* s.dismiss();
				 
				 String text = s.getText();
			 System.out.println(text);*/
		
				 Thread.sleep(3000);
				 d.close();
}
}
