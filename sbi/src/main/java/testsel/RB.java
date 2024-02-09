package testsel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		d.get("https://uathealth.renewbuyinsurance.in/health/input/basic-details");
//		d.findElement(By.id("auto-fullName")).sendKeys("ashish kumar");
//		d.findElement(By.id("auto-mobile")).sendKeys("8091158882");
//		d.findElement(By.id("auto-email")).sendKeys("testa@mail.com");
//		d.findElement(By.xpath("//*[@id=\"auto-getStarted\"]")).click();		
//		WebElement element= d.findElement(By.id("auto-ageDropDown"));
//		new Actions(d).click(element).perform();
//		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/label/div/input\r\n"
//				+ "")).sendKeys("27");
//		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/label/div/div/div/p")).click();
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//*[@id=\"auto-Continue\"]")).click();
//		d.findElement(By.id("auto-location")).sendKeys("shim");
//		Thread.sleep(5000);
//		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/ul/li/h6")).click();
//		d.findElement(By.xpath("//*[@id=\"auto-Continue\"]")).click();
//		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/label")).click();

		//d.get("https://uathealth.renewbuyinsurance.in/health/quotes/10058898?enquiryId=eyJpdiI6Ind0QkFnNFBuQkdQL05QVU9Kc2oxVWc9PSIsInZhbHVlIjoiMzNjcXd1SUt0Yy9pWTZ5LzJ4ZS9MQT09IiwibWFjIjoiOTExY2NiZDQ3YjAwNDlmOWRhNDk0MTgzMWNlZmU1YjgwOGNmNGFhMGE2MmZmNDljZGIwZDQxMGQ4MjYwN2Q2YyJ9");
		//Thread.sleep(40000);
		d.get("https://uathealth.renewbuyinsurance.in/health/productdetails/10058898?enquiryId=eyJpdiI6Ind0QkFnNFBuQkdQL05QVU9Kc2oxVWc9PSIsInZhbHVlIjoiMzNjcXd1SUt0Yy9pWTZ5LzJ4ZS9MQT09IiwibWFjIjoiOTExY2NiZDQ3YjAwNDlmOWRhNDk0MTgzMWNlZmU1YjgwOGNmNGFhMGE2MmZmNDljZGIwZDQxMGQ4MjYwN2Q2YyJ9&pincode=undefined&city=undefined");
		//d.manage().window().maximize();
		
		//d.findElement(By.xpath("//*[@id=\"auto_zuno_health_insurance_silver_individual"]")).click();
		
		//d.findElement(By.xpath("//*[@id=\"product-page\"]/div[2]/div[1]/main/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[3]/p[2]/div/div/div[2]/div")).click();
		//d.findElement(By.xpath("//*[@id=\"auto-continueCTA\"]")).click();
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		//Thread.sleep(4000);
        //d.findElement(By.xpath("//*[@id=\"auto_arogya_supreme_pro\"]")).click();
		//d.findElement(By.id("auto_arogya_supreme_pro")).click();
        
      //  WebDriverWait wait = new WebDriverWait(d,  Duration.ofSeconds(100000));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"quotes-page\"]/div[2]/div/div[3]/div[1]/div/div/button[2]"))).click();  
	      // try {
	             // Use an explicit wait to wait for the element to be clickable            
	            //  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("auto_arogya_supreme_pro")));
	              // If the element is found, click on it
	           //   element.click();
	    //  } catch (Exception e) {
	              // If the element is not found, scroll to it and then click
	            //  ((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView(true);", d.findElement(By.id("auto_arogya_supreme_pro")));
	           //   d.findElement(By.id("auto_arogya_supreme_pro")).click();
	         // } 
        
        
        
//        WebElement targetElement = d.findElement(By.id("auto_arogya_supreme_pro"));
//        JavascriptExecutor js= ((JavascriptExecutor)d);      
//        js.executeScript("arguments[0].scrollIntoView(true);",targetElement); 
//        Thread.sleep(3000);
//        targetElement.click(); 
//        Thread.sleep(3000);
//        d.findElement(By.id("auto-continueCTA")).click();
       
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

		//d.findElement(By.id("auto_tenureDiscount3")).click();
		
		Thread.sleep(10000);
		
		d.findElement(By.xpath("//*[@id=\"Plan-Feature-Options\"]/div/div/div[1]")).click();
		//Thread.sleep(2000);
		//d.findElement(By.xpath("//*[@id=\"Plan-Feature-Options\"]/div/div/div[2]")).click();
 		Thread.sleep(8000);
 		d.findElement(By.xpath("//*[@id=\"816\"]")).click();
 		
//		Thread.sleep(4000);
//		d.findElement(By.xpath("//*[@id=\"Plan-Feature-Options\"]/div/div/div[4]")).click();

 		
	}

}

 