package testing;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AbstractComponents.ReuseComponents;
import Components.CartSection;
import Components.ProductCatalog;
import Components.landingPage;

public class test2 extends baseTest{

@Test(retryAnalyzer=Retry.class)
public void FirstRun() throws IOException, InterruptedException{
		
		LP.loginnow("automate123@gmail.com", "Test@12234");		
		WebElement MSG=d.findElement(By.id("toast-container"));
		ReuseComponents RC= new ReuseComponents(d);
		RC.visibletime(MSG);
		//String SuccessMsg=d.findElement(By.xpath("div[@aria-label='Incorrect email or password.']")).getText();
		String FailureMsg=d.findElement(By.id("toast-container")).getText();
		Assert.assertEquals("Incorrect email or pasword.", FailureMsg);
		
		
	}

@Test
public void SecondRun() throws IOException, InterruptedException{
		
		LP.loginnow("automate123@gmail.com", "Test@1234");
		
		WebElement MSG=d.findElement(By.id("toast-container"));
		ReuseComponents RC= new ReuseComponents(d);
		RC.visibletime(MSG);
		String SuccessMsg=d.findElement(By.id("toast-container")).getText();
		Assert.assertEquals("Login Successfully", SuccessMsg);
			
	}

}
