package renewbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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

		d.get("https://uathealth.renewbuyinsurance.in/health/quotes/10058293?enquiryId=eyJpdiI6IkZ4U2dzVzJyUm9CT1piSkRvelMxK3c9PSIsInZhbHVlIjoiVklTaFU1SDBHN1ZVbW1BMlE5YjdMdz09IiwibWFjIjoiNzI1NWY5MDJiOTE3OGZiY2U4MjJjMDA0NTI2M2FhMGRmYTcxNmZiNjRmMjRiOGE5N2Q3OTE4NTZiMmI2YTgzZSJ9");
		//Thread.sleep(40000);
		//d.manage().window().maximize();
		Thread.sleep(40000);
		//d.findElement(By.xpath("//*[@id=\"auto_zuno_health_insurance_silver_individual"]")).click();
		
		//d.findElement(By.xpath("//*[@id=\"product-page\"]/div[2]/div[1]/main/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[3]/p[2]/div/div/div[2]/div")).click();
		//d.findElement(By.xpath("//*[@id=\"auto-continueCTA\"]")).click();
		
		
        d.findElement(By.xpath("//*[@id=\"auto_arogya_supreme_pro\"]")).click();
	    
	    d.findElement(By.id("auto-continueCTA")).click();
	}

}

 