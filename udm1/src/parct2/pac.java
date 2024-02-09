package parct2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class pac {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();
		
		WebElement drop=d.findElement(By.xpath("//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
		
		Select dropdown = new Select(drop);
		
		//System.out.println(dropdown.getOptions());
		
		//dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("USD");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		d.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
		for(int i=0;i<4;i++)
		{
			d.findElement(By.xpath("//*[@id=\"hrefIncAdt\"]")).click();
		}
		
		d.findElement(By.xpath("//*[@id=\"btnclosepaxoption\"]")).click();
		
		
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
//		d.findElement(By.xpath("//a[@value='JAI']")).click();
//		Thread.sleep(1000);
//		d.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//		
		
		d.findElement(By.xpath("//*[@id=\"citydropdown\"] //*[@value=\"MAA\"]" )).click();	
		d.findElement(By.xpath("//*[@id=\"citydropdown\"] //*[@value=\"BLR\"]" )).click();	
		
	}

}
