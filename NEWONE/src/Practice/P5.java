package Practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://www.foundit.in/rio/login");
	d.findElement(By.xpath("//*[@id=\"ssoDefault\"]/div/div/div/div[2]/div[2]/div[1]/div[2]/div/a")).click();
	File f = new File("./testdata/Mayur Wagh.pdf");
	String path = f.getAbsolutePath();
	d.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys(path);
	Thread.sleep(3000);
	d.close();
}
}
