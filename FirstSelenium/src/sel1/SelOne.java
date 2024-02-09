package sel1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelOne {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		d.get("https://www.renewbuy.com/health/input/basic-details");
		d.findElement(By.id("auto-fullName")).sendKeys("Adfg asdf");
		d.findElement(By.xpath("//input[@id='auto-mobile']")).sendKeys("9876789875");
		d.findElement(By.xpath("//input[@id='auto-email']")).sendKeys("asdf2@asdg.com");
		d.findElement(By.id("auto-getStarted")).click();
		
		//first member self
		
		String Self="//*[@id=\"auto-ageDropDown\"]/div/a/div/p";
		String Spouse="(//*[@id=\"auto-ageDropDown\"]/div/a/div/p)[2]";

		d.findElement(By.xpath(Self)).click();
		d.findElement(By.xpath("//*[@id=\"auto-ageDropDown\"]/div/input")).sendKeys("27");
		d.findElement(By.xpath("//*[@id=\"auto-ageDropDown\"]/div/div")).click();
		
		//second member spouse
		
		d.findElement(By.xpath(Spouse)).click();
		d.findElement(By.xpath("//*[@id=\"auto-ageDropDown\"]/div/input")).sendKeys("22");
		d.findElement(By.xpath("//*[@id=\"auto-ageDropDown\"]/div/div")).click();
		
		// 
		
		d.findElement(By.xpath("(//*[@id=\"auto-ageDropDown\"]/div/a/div/p)[3]")).click();
		d.findElement(By.xpath("//*[@id=\"auto-ageDropDown\"]/div/input")).sendKeys("3");
		d.findElement(By.xpath("//*[@id=\"auto-ageDropDown\"]/div/div")).click();
	}
	
}
         //d.findElement(By.xpath("//div[@id='auto-self']")).click();		
		//d.findElement(By.xpath("//label[@id='auto-ageDropDown']")).click();
		//d.findElement(By.xpath("//label[@id='auto-ageDropDown']")).sendKeys("27");
		//d.findElement(By.xpath("//*[@id=\"auto-27 Years\"]")).click();
		//d.findElement(By.xpath("(//a[.])[3]")).click();
		//d.findElement(By.id("auto-23 Years")).click();
		//d.findElement(By.id("continueCTA")).click();
		//Thread.sleep(2000);
		//d.findElement(By.id("continueCTA")).click();
		//d.findElement(By.xpath("(//label[.])[3]")).click();
		//d.findElement(By.id("continueCTA")).click();
		//Thread.sleep(2000);
		//d.findElement(By.xpath("(//label[.])[2]")).click();