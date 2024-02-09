package Components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.ReuseComponents;

public class ProductCatalog extends ReuseComponents {
	WebDriver d;

	public ProductCatalog(WebDriver d) {
		super(d);
		this.d = d;
		PageFactory.initElements(d, this);
	}

	// WebElement userEmail=d.findElement(By.id("userEmail"));

	@FindBy(css = ".mb-3")
	List<WebElement> AllProds;
	
	@FindBy(css=".ng-animating")
	WebElement InvisibleTime;
	
	@FindBy(id="toast-container")
	WebElement VisibleItemTime;
	
	
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	WebElement gotoCart;
	

	By ProductsId = By.cssSelector(".mb-3");
	//By VisibleItemTime= By.id("toast-container");

	public List<WebElement> getProducts() {
		Waiting(ProductsId);
		return AllProds;
	}
	
	public WebElement getProdByName(String Prodname) {
		
		WebElement Prod=getProducts().stream()
		.filter(s -> s.findElement(By.cssSelector("b")).getText().equals(Prodname)).findFirst()
		.orElse(null);
		return Prod;
	}
	
	public void getItem(String Prodname) throws InterruptedException {
		WebElement Prod=getProdByName(Prodname);
		Prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		//visibletime(VisibleItemTime);
		invisibletime();
		gotoCart.click();
	}
	
//	public int Add(int first , int second) {
//		int a = first;
//		int b = second;
//		int c=a+b;
//		return c;
//	}
}

//WebElement Prod = allProducts.stream()
//.filter(s -> s.findElement(By.cssSelector("b")).getText().equals(Productname)).findFirst()
//.orElse(null);






























