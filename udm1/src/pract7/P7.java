package pract7;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P7 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();

		d.get("https://the-internet.herokuapp.com/");

//		d.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
//
//		d.findElement(By.xpath("//*[text()='Click Here']")).click();
//
//		Set<String> w = d.getWindowHandles();
//		Iterator<String> IT = w.iterator();
//		String ParentID = IT.next();
//		String ChildID = IT.next();
//
//		d.switchTo().window(ChildID);
//		String ChildCon = d.findElement(By.cssSelector(".example")).getText();
//
//		System.out.println(ChildCon);
//
//		d.switchTo().window(ParentID);
//
//		String ParentCon = d.findElement(By.cssSelector("h3")).getText();
//
//		System.out.println(ParentCon);

		// ==================frames check =====================

		d.findElement(By.partialLinkText("Nested Frames")).click();
		d.switchTo().frame("frame-top");
		WebElement MainF = d.findElement(By.cssSelector("[name='frame-middle']"));
		d.switchTo().frame(MainF);
		String t = d.findElement(By.id("content")).getText();
		System.out.println(t);

	}

}
