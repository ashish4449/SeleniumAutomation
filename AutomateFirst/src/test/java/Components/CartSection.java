package Components;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.ReuseComponents;

public class CartSection extends ReuseComponents {
	WebDriver d;

	public CartSection(WebDriver d) {
		super(d);
		this.d = d;
		PageFactory.initElements(d, this);
	}

	// WebElement userEmail=d.findElement(By.id("userEmail"));


	@FindBy(css=".cartSection h3")
	List<WebElement> ComparisionItem;
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement CountryName;
	
	@FindBy(xpath="//section[@class='ta-results list-group ng-star-inserted']")
	List<WebElement> CountryList;
	
	@FindBy(css=".totalRow button")
	WebElement chckProceed;
	
	@FindBy(xpath="//div[@class='actions'] //a")
	WebElement Checkout;
	
	public void ItemCompareCheck(String ProdName) {
		Boolean test=ComparisionItem.stream().anyMatch(s->s.getText().equalsIgnoreCase(ProdName));  // here anyMatch string function provide Boolean value
		Assert.assertTrue(test);
		chckProceed.click();
	}
	public void Country(String ConName) {
		CountryName.sendKeys(ConName);
		CountryList.stream().filter(s->s.getText().contains(ConName)).forEach(s->s.click());
		Checkout.click();
		
	}

	
}































