package testsel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class RB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
     	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//		d.get("https://uathealth.renewbuyinsurance.in/health/input/basic-details");
//		d.findElement(By.id("auto-fullName")).sendKeys("ashish kumar");
//		d.findElement(By.id("auto-mobile")).sendKeys("8091158882");
//		d.findElement(By.id("auto-email")).sendKeys("testa@mail.com");
//		d.findElement(By.xpath("//*[@id=\"auto-getStarted\"]")).click();		
		//*[@id="auto_self"]/section[2]
		
		//d.findElement(By.xpath("//*[@id=\"auto_self\"]/section[2]")).sendKeys("25");
//		d.findElement(By.xpath("//div[@id='auto_self']/section//input")).click();
//		d.findElement(By.xpath("//div[@id='auto_self']/section//input")).sendKeys("34");
//		d.findElement(By.xpath("//div[@id='auto_self']/section//input")).sendKeys(Keys.ENTER);
//		
//		d.findElement(By.xpath("//div[@id='auto_spouse']/section//input")).click();
//		d.findElement(By.xpath("//div[@id='auto_spouse']/section//input")).sendKeys("33");
//		d.findElement(By.xpath("//div[@id='auto_spouse']/section//input")).sendKeys(Keys.ENTER);
//		
		
//		d.findElement(By.xpath("(//*[@id=\"coverDrop\"])[2]")).click();
//		d.findElement(By.xpath("//*[@id=\"coverDrop\"]/div/div[1]/div[2]")).sendKeys("34");
//		d.findElement(By.xpath("//*[@id=\"coverDrop\"]/div/div[1]/div[2]")).sendKeys(Keys.ENTER);
		
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
		//d.get("https://uathealth.renewbuyinsurance.in/health/productdetails/10058898?enquiryId=eyJpdiI6Ind0QkFnNFBuQkdQL05QVU9Kc2oxVWc9PSIsInZhbHVlIjoiMzNjcXd1SUt0Yy9pWTZ5LzJ4ZS9MQT09IiwibWFjIjoiOTExY2NiZDQ3YjAwNDlmOWRhNDk0MTgzMWNlZmU1YjgwOGNmNGFhMGE2MmZmNDljZGIwZDQxMGQ4MjYwN2Q2YyJ9&pincode=undefined&city=undefined");
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
       
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

		//d.findElement(By.id("auto_tenureDiscount3")).click();
		
		//Thread.sleep(10000);
		
		//d.findElement(By.xpath("//*[@id=\"Plan-Feature-Options\"]/div/div/div[1]")).click();
		//Thread.sleep(2000);
		//d.findElement(By.xpath("//*[@id=\"Plan-Feature-Options\"]/div/div/div[2]")).click();
 		//Thread.sleep(5000);
 		//d.findElement(By.id("auto-review-cart-button")).click();
 		//d.findElement(By.xpath("//*[@id=\"816\"]")).click();
 		
 		//WebDriverWait wait = new WebDriverWait(driver, new SystemClock(), Duration.ofSeconds(10));
        
 		
 		//WebDriverWait wait = new WebDriverWait(d, 10);  // You can adjust the timeout as needed
 		//WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("auto-review-cart-button")));

 		//button.click();
 		
//		Thread.sleep(4000);
//		d.findElement(By.xpath("//*[@id=\"Plan-Feature-Options\"]/div/div/div[4]")).click();
		d.get("https://uathealth.renewbuyinsurance.in/health/productdetails/10059421?enquiryId=eyJpdiI6IlRZMWRkOW96dzAvQUp3YThRKzRpREE9PSIsInZhbHVlIjoiMGRtNTh1aVpaWnJCMHlFTllZYnBrZz09IiwibWFjIjoiNmQwZmFlMjM1Y2YxOTg2YTI1NWJjMTIxMDkyOTJmNWQ5OWUwZDBkNzA4MTAwMGYzZDM5MTJmZjZkZDE0OTQyOCJ9");
 		d.manage().window().maximize();		
		d.findElement(By.xpath("//*[@id=\"auto_tenureDiscount2\"]")).click();
		
		
		
// 		WebDriverWait Wait= new WebDriverWait(d,Duration.ofSeconds(10));				
//        WebElement review=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[.='Review Your Cart']")));
// 		review.click();
//		
 		//d.findElement(By.xpath("//*[@id=\"auto-review-cart-button\"]")).click();
 	
 		
	
		((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView(true);",d.findElement(By.xpath("//h6[.='Review Your Cart']")));
		Thread.sleep(10000);
		d.findElement(By.xpath("//*[@id=\"auto-review-cart-button\"]")).click();
		Thread.sleep(4000);
		d.findElement(By.id("auto-proceed-to-proposal")).click();
		d.findElement(By.id("auto-proceed-kyc")).click();
	
	}
}

 