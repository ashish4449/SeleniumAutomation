package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filedownloadpopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);
	driver.close();
	
	
}
}
