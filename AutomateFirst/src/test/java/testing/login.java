package testing;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Components.CartSection;
import Components.ProductCatalog;

public class login extends baseTest {

	@Test(dataProvider = "hashData")
	public void FirstRun(HashMap<String, String> input) throws IOException, InterruptedException {
		String Productname = "ADIDAS ORIGINAL";
		String conName = "British Indian Ocean Territory";
//		WebDriver d = new ChromeDriver();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		d.manage().window().maximize();
//		d.get("https://rahulshettyacademy.com/client");

//		landingPage LP= new landingPage(d);
//		LP.goTo();

		// LP.loginnow("automate123@gmail.com", "Test@1234");
		LP.loginnow(input.get("Email"), input.get("Pass"));

		ProductCatalog PC = new ProductCatalog(d);
		PC.getProducts();

		PC.getProdByName(Productname);
		PC.getItem(Productname);

		CartSection CS = new CartSection(d);
		CS.ItemCompareCheck(Productname);
		CS.Country(conName);

//		d.findElement(By.id("userEmail")).sendKeys("automate123@gmail.com");
//		d.findElement(By.id("userPassword")).sendKeys("Test@1234");
//		d.findElement(By.id("login")).click();

//		List<WebElement> allProducts = d.findElements(By.cssSelector(".mb-3"));
//		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(4));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

//		WebElement Prod = allProducts.stream()
//				.filter(s -> s.findElement(By.cssSelector("b")).getText().equals(Productname)).findFirst()
//				.orElse(null);

		// Prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

//		WebDriverWait wt = new WebDriverWait(d, Duration.ofSeconds(10));
//
//		wt.until(ExpectedConditions.visibilityOfElementLocated((By.id("toast-container"))));
//
//		wt.until(ExpectedConditions.invisibilityOf((d.findElement(By.cssSelector(".ng-animating")))));
//
//		d.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();

//		List <WebElement> CartList=d.findElements(By.cssSelector(".cartSection h3"));

		// CartList.stream().forEach(s->s.findElement(By.xpath("//ul[@class='cartWrap
		// ng-star-inserted'] //h3")).getText())

		// CartList.stream().filter(s->s.findElement(By.cssSelector("h3")).getText().equals(Productname));

//		Boolean test=CartList.stream().anyMatch(s->s.getText().equalsIgnoreCase(Productname));  // here anyMatch string function provide Boolean value
//		Assert.assertTrue(test);

		// d.findElement(By.cssSelector(".totalRow button")).click();

		// d.findElement(By.xpath("(//div[@class='field small'])[2]
		// //input")).sendKeys("123");

		// d.findElement(By.xpath("(//div[@class='field'])[2]")).sendKeys("test card
		// name");

		// d.findElement(By.name("coupon"));

		// d.findElement(By.cssSelector(".btn.btn-primary.mt-1")).click();

//		
//		d.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys(conName);
//		
//		List <WebElement> con=d.findElements(By.xpath("//section[@class='ta-results list-group ng-star-inserted']"));
//		
//		con.stream().filter(s->s.getText().contains(conName)).forEach(s->s.click());
//		
//		d.findElement(By.xpath("//div[@class='actions'] //a")).click();
//		
		String OrderNo = d.findElement(By.xpath("//tr[@class='ng-star-inserted']")).getText();
		System.out.println(OrderNo);

//		
//		int total=PC.Add(100, 220);
//		System.out.println(total);
//		

	}

	@DataProvider
	public Object[][] getData() {

		return new Object[][] { { "automate123@gmail.com", "Test@1234" }, { "shetty@gmail.com", "Iamking@000" } };
	}

	@DataProvider
	public Object[][] hashData() {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("Email", "automate123@gmail.com");
		map.put("Pass", "Test@1234");

		HashMap<Object, Object> map1 = new HashMap<Object, Object>();
		map1.put("Email", "shetty@gmail.com");
		map1.put("Pass", "Iamking@000");

		return new Object[][] { { map }, { map1 } };
	}

	public String ScreenShot(String testCaseName, WebDriver d) throws IOException {

		TakesScreenshot ss = (TakesScreenshot) d; // casting the driver to the screenshot mode
		File source = ss.getScreenshotAs(OutputType.FILE); // in which format the ss will save
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png"); // file name or
																										// location
																										// where the
																										// file will
																										// save
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";

	}
}
