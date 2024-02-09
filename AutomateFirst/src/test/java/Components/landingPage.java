package Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.ReuseComponents;

public class landingPage extends ReuseComponents {
	WebDriver d;
	
	public landingPage(WebDriver d) {
		super(d);
		this.d=d;
		PageFactory.initElements(d,this);
	}

	//WebElement userEmail=d.findElement(By.id("userEmail"));
	
	//PageFactory
	@FindBy(id="userEmail")
	WebElement userEmaill;
	
	@FindBy(id="userPassword")
	WebElement userPasswordd;
	
	@FindBy(id="login")
	WebElement login;
	
	public void loginnow(String userEmail,String userPassword) {
		userEmaill.sendKeys(userEmail);
		userPasswordd.sendKeys(userPassword);
		login.click();
	}
	
	public void goTo() {
		d.get("https://rahulshettyacademy.com/client");
	}
	

}
