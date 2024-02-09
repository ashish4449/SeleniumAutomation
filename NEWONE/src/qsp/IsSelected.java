package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	 
		 static {
		 	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) throws InterruptedException {
		 	WebDriver driver = new ChromeDriver();
		 	driver.manage().window().maximize();
		 	driver.get("https://demo.actitime.com/login.do");
		 	Thread.sleep(3000);
		 	 boolean button= driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		 	if (button == true ) {
		 		System.out.println("checkbox is selcted");
		 	} else {
		 		System.out.println("checkbox is de`selected");
		 	}
		 	driver.close();
		 }
		 
}
