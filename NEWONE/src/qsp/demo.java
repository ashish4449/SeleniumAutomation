package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("https://www.javatpoint.com/software-testing-tutorial");
	Thread.sleep(10000);
	c.close();
	
}
}
