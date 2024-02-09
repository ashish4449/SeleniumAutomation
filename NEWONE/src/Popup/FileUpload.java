package Popup;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* WAS upload your resume demo application */
public class FileUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/waghm/Desktop/fileUpload1.html");
		//driver.findElement(By.id("choose")).sendKeys("C:\\Users\\waghm\\eclipse-workspace\\Automation\\testdata\\Mayur Wagh.pdf");
		File f = new File("./testdata/Mayur Wagh.pdf");
		 String path = f.getAbsolutePath();
		driver.findElement(By.id("choose")).sendKeys(path);
		Thread.sleep(3000);
		driver.close();
	}
}
