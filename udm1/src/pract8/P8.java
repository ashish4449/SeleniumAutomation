package pract8;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement test = d.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));

		System.out.println(test.findElements(By.tagName("a")).size());

		String ctrlEnterCombo = Keys.chord(Keys.CONTROL, Keys.ENTER);

		for (int i = 1; i < test.findElements(By.tagName("a")).size(); i++) {

			test.findElements(By.tagName("a")).get(i).sendKeys(ctrlEnterCombo);
			Thread.sleep(5000);
		}
		Set<String> ids = d.getWindowHandles();
		Iterator<String> allWin = ids.iterator();

		while (allWin.hasNext()) {
			d.switchTo().window(allWin.next());
			System.out.println(d.getTitle());

		}

	}

}
