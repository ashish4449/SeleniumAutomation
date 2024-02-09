package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndex {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/men-footwear");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//h3[.='Puma'])[2]")).click();
	Thread.sleep(2000);
	driver.close();
}
}
