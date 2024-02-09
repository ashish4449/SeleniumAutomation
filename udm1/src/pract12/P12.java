package pract12;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class P12 {

	public static void main(String[] args) {
		 WebDriver d= new ChromeDriver();
		 d.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 JavascriptExecutor js= (JavascriptExecutor)d;
		 
		 js.executeScript("window.scrollBy(0,500);");

		 js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500;");
		 
		List <WebElement> lis= d.findElements(By.xpath("(//table[@id='product'])[2] //td[1]"));
		
		
		lis.stream().forEach(s->System.out.println(s.getText()));
		
		System.out.println("****************");
		
		//lis.stream().filter(s->s.getText().startsWith("J")).forEach(s->System.out.println(s.getText()));
		
		
		
		//System.out.println("============================================================");
		
		
		//lis.stream().map(s->s.getText().toUpperCase()).forEach(s->System.out.println(s));
		
		
		System.out.println("===*88888888888888888888888888====================");
		
		lis.stream().filter(s->s.getText().startsWith("R")).map(s->s.getText().toUpperCase()).sorted().forEach(s->System.out.println(s));
	
		
		
	}

}
