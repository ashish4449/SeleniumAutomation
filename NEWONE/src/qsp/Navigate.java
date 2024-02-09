package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe")	;
}
public static void main(String[] args) throws InterruptedException {
WebDriver w=new ChromeDriver();
w.manage().window().maximize();
w.navigate().to("https://www.youtube.com/");
Thread.sleep(5000);
w.navigate().to("https://www.instagram.com/");
w.navigate().back();
Thread.sleep(5000);
w.navigate().forward();
Thread.sleep(5000);
w.navigate().refresh();
Thread.sleep(5000);
w.close();

}
}
