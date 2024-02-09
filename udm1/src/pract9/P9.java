package pract9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P9 {
	
	public static void main(String[] args) throws InterruptedException {
//		WebDriver d = new ChromeDriver();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		d.get("https://rahulshettyacademy.com/AutomationPractice/");
//		
//		String mainOption=d.findElement(By.xpath("//label[@for='benz']")).getText().toLowerCase();
//		System.out.println(mainOption);
//		d.findElement(By.xpath("//input[@value='option2']")).click();
//		
//		WebElement Selec=d.findElement(By.id("dropdown-class-example"));
//		
//		Select s = new Select(Selec);		
//		s.selectByValue(mainOption);
//		
//		d.findElement(By.id("name")).sendKeys(mainOption);
//		d.findElement(By.id("alertbtn")).click();
//		
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		
		WebElement target=d.findElement(By.cssSelector(".tableFixHead"));
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500;");
		int total=0;
		List<WebElement> no=d.findElements(By.xpath("//table[@id='product'] //td[4]"));
		
		for(int i=0;i<no.size();i++) {
			
			
		     total=total + Integer.parseInt(no.get(i).getText());
		     	
		}
		System.out.println(total);
			
	}
	
	
}


