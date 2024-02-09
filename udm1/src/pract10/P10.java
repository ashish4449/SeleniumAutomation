package pract10;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class P10 {
	
	
		public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> Rows = d.findElements(By.xpath("(//*[@id=\"product\"])[1] //tr"));

		System.out.println("Total no. of Rows are = " + Rows.size());

		List<WebElement> Column = d.findElements(By.xpath("(//*[@id=\"product\"])[1] //th"));

		System.out.println("Total no. of Columns are = " + Column.size());

		String rd = d.findElement(By.xpath("(//*[@id=\"product\"])[1] //tr[3]")).getText();

		System.out.println(rd);
	}

}

