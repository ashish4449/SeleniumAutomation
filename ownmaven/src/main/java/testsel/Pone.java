package testsel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pone {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://uathealth.renewbuyinsurance.in/health/input/basic-details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		FileInputStream file= new FileInputStream("C:\\Users\\yowow\\OneDrive\\Desktop\\testsel.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		//System.out.println(rowCount);
		//int colCount=sheet.getRow(0).getFirstCellNum();
		
		for(int i=1; i<=rowCount; i++) {
			System.out.println(i);
			XSSFRow CurrentRow = sheet.getRow(i);
			
			String FullName= CurrentRow.getCell(0).getStringCellValue();
			String Mobile= CurrentRow.getCell(1).getStringCellValue();
			String Email= CurrentRow.getCell(2).getStringCellValue();
			String PlanType= CurrentRow.getCell(5).getStringCellValue().toLowerCase();
			String Pincode= CurrentRow.getCell(6).getStringCellValue();
			String ICname= CurrentRow.getCell(7).getStringCellValue();
			String Tenure= CurrentRow.getCell(8).getStringCellValue();
			System.out.println(Tenure);
			
			
					
			String MemberOneValue = CurrentRow.getCell(3).getStringCellValue();   // Member 1 full value Relation with age ex--(Self 27)
			String Member1Relation= MemberOneValue.replaceAll("[^A-Za-z]","").toLowerCase().toString();  
			String Member1Age= MemberOneValue.replaceAll("[^0-9]","");  
			System.out.println("String b ="+Member1Relation);  
			System.out.println("Int c ="+Member1Age);  
			
			String MemberTwoValue = CurrentRow.getCell(4).getStringCellValue();   // Member 2 full value Relation with age ex--(Self 27)
			String Member2Relation= MemberTwoValue.replaceAll("[^A-Za-z]","").toLowerCase().toString();  
			String Member2Age= MemberTwoValue.replaceAll("[^0-9]",""); 
			System.out.println("String b ="+Member2Relation);  
			System.out.println("Int c ="+Member2Age);

	
			for(int fullIteration =1; fullIteration>0; fullIteration--)  //this 2nd loop is for no. of execution
			{

			driver.get("https://uathealth.renewbuyinsurance.in/health/input/basic-details");
			
			driver.findElement(By.id("auto-fullName")).sendKeys(FullName);
			driver.findElement(By.xpath("//input[@id='auto-mobile']")).sendKeys(Mobile);
			driver.findElement(By.xpath("//input[@id='auto-email']")).sendKeys(Email);
			driver.findElement(By.id("auto-getStarted")).click();
//----------------------------------------------------------------------------------RELATIONS----------------------------------			
		switch (Member1Relation) {
	    case "self":
	        driver.findElement(By.xpath("//div[@id='auto_self']/section//input")).click();
	        driver.findElement(By.xpath("//div[@id='auto_self']/section//input")).sendKeys(Member1Age);
			driver.findElement(By.xpath("//div[@id='auto_self']/section//input")).sendKeys(Keys.ENTER);
	        break;
	    case "spouse":
	        //Spouse
	    	driver.findElement(By.xpath("//div[@id='auto_spouse']/section//input")).click();
	        driver.findElement(By.xpath("//div[@id='auto_spouse']/section//input")).sendKeys(Member1Age);
			driver.findElement(By.xpath("//div[@id='auto_spouse']/section//input")).sendKeys(Keys.ENTER);
	        break;
	    case "father":
	        //Father
	    	driver.findElement(By.xpath("//div[@id='auto_father']/section//input")).click();
	        driver.findElement(By.xpath("//div[@id='auto_father']/section//input")).sendKeys(Member1Age);
			driver.findElement(By.xpath("//div[@id='auto_father']/section//input")).sendKeys(Keys.ENTER);
	        break;
	    case "mother":
	    	driver.findElement(By.xpath("//div[@id='auto_mother']/section//input")).click();
	        driver.findElement(By.xpath("//div[@id='auto_mother']/section//input")).sendKeys(Member1Age);
			driver.findElement(By.xpath("//div[@id='auto_mother']/section//input")).sendKeys(Keys.ENTER);
	        break;
	    default:
	        System.out.println("Kindly check your sheet");
	        break;
		}
		
		switch (Member2Relation) {
		case "self":
	        driver.findElement(By.xpath("//div[@id='auto_self']/section//input")).click();
	        driver.findElement(By.xpath("//div[@id='auto_self']/section//input")).sendKeys(Member2Age);
			driver.findElement(By.xpath("//div[@id='auto_self']/section//input")).sendKeys(Keys.ENTER);
	        break;
	    case "spouse":
	        //Spouse
	    	driver.findElement(By.xpath("//div[@id='auto_spouse']/section//input")).click();
	        driver.findElement(By.xpath("//div[@id='auto_spouse']/section//input")).sendKeys(Member2Age);
			driver.findElement(By.xpath("//div[@id='auto_spouse']/section//input")).sendKeys(Keys.ENTER);
	        break;
	    case "father":
	        //Father
	    	driver.findElement(By.xpath("//div[@id='auto_father']/section//input")).click();
	        driver.findElement(By.xpath("//div[@id='auto_father']/section//input")).sendKeys(Member2Age);
			driver.findElement(By.xpath("//div[@id='auto_father']/section//input")).sendKeys(Keys.ENTER);
	        break;
	    case "mother":
	    	driver.findElement(By.xpath("//div[@id='auto_mother']/section//input")).click();
	        driver.findElement(By.xpath("//div[@id='auto_mother']/section//input")).sendKeys(Member2Age);
			driver.findElement(By.xpath("//div[@id='auto_mother']/section//input")).sendKeys(Keys.ENTER);
	        break;
	    default:
	        System.out.println("Kindly check your sheet");
	        break;
		}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"auto-Continue\"]")).click();
		//driver.switchTo().newWindow(WindowType.TAB);
		
		
		System.out.println(PlanType);
		
		Thread.sleep(2000);
//-------------------------------------------------------------------------------Plan Type----------------------------------
		switch (PlanType) {
		case "family":
			driver.findElement(By.xpath("//*[@id=\"auto_F\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"auto-Continue\"]")).click();
		    break;
		case "multi":
			driver.findElement(By.xpath("//*[@id=\"auto_M\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"auto-Continue\"]")).click();
	        break;
	        default:
	        	System.out.println("some issue in plantype");
	        break;
		}
		
//-------------------------------------------------------------------------------PINCODE------------------------------------------------
		System.out.println(Pincode);
		
		
		driver.findElement(By.id("auto-location")).sendKeys(Pincode);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/ul/li/h6")).click();
	    driver.findElement(By.xpath("//*[@id=\"auto-Continue\"]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//*[@id=\"auto_No\"]")).click();
		
		
		
//------------------------------------------------------------------------------IC PLAN NAME-------------------------------------------		
	    System.out.println(ICname);	
	    
	    Thread.sleep(40000);
	    
	    WebElement targetElement = driver.findElement(By.id("auto_arogya_supreme_pro"));
        JavascriptExecutor js= ((JavascriptExecutor)driver);      
        js.executeScript("arguments[0].scrollIntoView(true);",targetElement); 
        Thread.sleep(3000);
        targetElement.click(); 
        Thread.sleep(3000);
        driver.findElement(By.id("auto-continueCTA")).click();

        
      //------------------------------------------------------------------------------IC Tenure-------------------------------------------		
        switch (Tenure) {
		case "1":
			driver.findElement(By.xpath("//*[@id=\"auto_tenureDiscount1\"]")).click();		
		    break;
		case "2":
			driver.findElement(By.xpath("//*[@id=\"auto_tenureDiscount2\"]")).click();		    
	        break;
		case "3":
			driver.findElement(By.xpath("//*[@id=\"auto_tenureDiscount3\"]")).click();		 
	        break;    
	        default:
	        	System.out.println("some issue in Tenure selection");
	        break;
		}
        
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//h6[.='Review Your Cart']")));
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"auto-review-cart-button\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("auto-proceed-to-proposal")).click();
		driver.findElement(By.id("auto-proceed-kyc")).click();
		
		
		//---------------------------------Proposal page -------------------------------------------------------
		
	}
			
	
}
	}
	}
	
	

		
	
	
		
	

          

