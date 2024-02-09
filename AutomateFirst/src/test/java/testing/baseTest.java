package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Components.landingPage;

public class baseTest {
	//WebDriver d = new ChromeDriver();
	public WebDriver d;
	public landingPage LP;
	

	
	
	public WebDriver IntilizationBrowser() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\yowow\\eclipse-workspace\\AutomateFirst\\src\\main\\java\\global\\global.properties");
		prop.load(fis);
		String BrowserName=prop.getProperty("browser");
		//String BrowserName=	System.getProperty("browser") !=null ? System.getProperty("browser"): System.getProperty("browser");
		if(BrowserName.equals("chrome")) {
			 d = new ChromeDriver();
		}else if(BrowserName.equals("edge")){
			 d = new EdgeDriver();
		} 
		
		
//		 d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		return d;
	}
	
	@BeforeMethod(alwaysRun=true)
	public landingPage HomePage() throws IOException{
		d=IntilizationBrowser();
		LP= new landingPage(d);
		LP.goTo();
		return LP;
		
	}	
	@AfterMethod(alwaysRun=true)
	public void trunOff() {
		d.close();
	}
	
}
