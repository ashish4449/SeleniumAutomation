package AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReuseComponents {

	WebDriver d;
	
	public ReuseComponents(WebDriver d) {
		this.d=d;
	}	
	
	
	public void Waiting(By ByLocator) {
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByLocator));
	}
	
	public void visibletime(WebElement ByLocator) {
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ByLocator));
	}
	public void invisibletime() throws InterruptedException {
		Thread.sleep(1000);
	}
}

