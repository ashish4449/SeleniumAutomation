package All_Reports.reports;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReports {
 
	ExtentReports ExReporter;
	@BeforeTest
	public void extentConfig() {
		String Path=System.getProperty("user.dir")+"\\report\\index.html";
		ExtentSparkReporter Reporter = new ExtentSparkReporter(Path);  // ExtentSparkreports needs a path to create a reports
		Reporter.config().setReportName("AshishReports");
		
		
		ExReporter= new ExtentReports();
		ExReporter.attachReporter(Reporter);
	}
	
	@Test
	public void firstReport()
	{
	ExtentTest Test=ExReporter.createTest("Firsttest");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		//Test.fail("not matching");
		ExReporter.flush();
		
		
	}
}
