package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        WebElement elec = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div/div"));
        Actions a=new Actions(driver);
        a.moveToElement(elec).perform();
        Thread.sleep(3000);
        WebElement lap = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[8]"));
        Actions b=new Actions(driver);
        b.moveToElement(lap).perform();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[5]/div/div[2]/div/div/div[1]/div/div[1]/div/div/div[1]/div[1]/a")).click();
	    Thread.sleep(4000);
	    driver.quit();
	}}
