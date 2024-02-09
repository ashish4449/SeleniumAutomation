package com.test.testmaven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sbip2 {
	@Test
	
public static void main(String[] args) throws InterruptedException, IOException {
         WebDriver driver = null;
        driver = new ChromeDriver();
        driver.manage().window().maximize();       
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(25000));
        FileInputStream file = new FileInputStream(".\\testdata\\sbi.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
       // String cover = "//*[@id=\"auto-300001-500000\"]";

        int rowCount = 1;

        XSSFRow currentRow = sheet.getRow(rowCount);

            
            Thread.sleep(300);
          
            String names = currentRow.getCell(0).getStringCellValue();
            String numbers = currentRow.getCell(1).getStringCellValue();
            String emails = currentRow.getCell(2).getStringCellValue();
            String self = currentRow.getCell(3).getStringCellValue();
            String spouse = currentRow.getCell(4).getStringCellValue();
            String son = currentRow.getCell(5).getStringCellValue();
            String daughter = currentRow.getCell(6).getStringCellValue(); 
            String cover = currentRow.getCell(7).getStringCellValue();
            String icname = currentRow.getCell(8).getStringCellValue();  
            String city = currentRow.getCell(9).getStringCellValue();
            String selfh = currentRow.getCell(10).getStringCellValue();
            String spouseh = currentRow.getCell(11).getStringCellValue();
            String sonh = currentRow.getCell(12).getStringCellValue();
            String daughterh = currentRow.getCell(13).getStringCellValue();
            String sweight = currentRow.getCell(14).getStringCellValue();
            String Wweight = currentRow.getCell(15).getStringCellValue();
            String s1weight = currentRow.getCell(16).getStringCellValue();
            String d1weight = currentRow.getCell(17).getStringCellValue();
            String DOB  = currentRow.getCell(18).getStringCellValue();
            String fDOB = currentRow.getCell(19).getStringCellValue();
            String kyc = currentRow.getCell(20).getStringCellValue();

             // Number of times to repeat the code

                driver.get("https://www.renewbuy.com/health/input/basic-details");
                driver.findElement(By.xpath("//input[@id='auto-fullName']")).sendKeys(names);
                driver.findElement(By.id("auto-mobile")).sendKeys(numbers);
                driver.findElement(By.id("auto-email")).sendKeys(emails);
                driver.findElement(By.xpath("//*[@id=\"input-page\"]/div[2]/div/div[1]/div/div[1]/div[2]/div/div[1]/div/form/button"))
                        .click();
                try {
                //self 
                driver.findElement(By.xpath("(//label[@id='auto-ageDropDown'])[1]")).click();
                driver.findElement(By.xpath("(//label[@id='auto-ageDropDown'])[1]")).sendKeys(self, Keys.ENTER);
                //spouse
                if (!spouse.isEmpty()) {
                	 driver.findElement(By.xpath("//div[ @id=\"auto-spouse\"]//label[ @id=\"auto-ageDropDown\"]")).click();
        		     driver.findElement(By.xpath("(//label[@id='auto-ageDropDown'])[2]")).sendKeys(spouse, Keys.ENTER);
                }
                //son
                if (!son.isEmpty()) {
                    driver.findElement(By.xpath("(//label[@id='auto-ageDropDown'])[3]")).click();
                    driver.findElement(By.xpath(son)).click();
                }
                //Daughter
                if (!daughter.isEmpty()) {
                    driver.findElement(By.xpath("(//label[@id='auto-ageDropDown'])[4]")).click();
                    driver.findElement(By.xpath(daughter)).click();
                }
                driver.findElement(By.xpath("//button[@class='sc-iGgWBj fsjzwa continue__btn']")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[@class='sc-iGgWBj fsjzwa continue__btn']")).click();

                if (!city.isEmpty()) {
                	 driver.findElement(By.id("auto-location")).sendKeys(city);
                	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/ul/li/h6")).click();
                     driver.findElement(By.xpath("//*[@id=\"auto-Continue\"]")).click();
                }   
                driver.findElement(By.xpath("//span[@id=\"auto_No\"]")).click();
                Thread.sleep(5000);
                
               // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
      	      //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"quotes-page\"]/div[2]/div/div[2]/div[4]")));
      	      WebElement svgElement = driver.findElement(By.xpath("//*[@id=\"quotes-page\"]/div[2]/div/div[2]/div[4]"));
      	      Actions s = new Actions(driver);
      	      s.click(svgElement).perform();
      	      // Click on the element corresponding to the current XPath in the loop
      	      driver.findElement(By.id(cover)).click();
      	      driver.findElement(By.xpath("//*[@id=\"auto_coverApply\"]")).click();
      	      Thread.sleep(2000);
      	      driver.findElement(By.xpath("//div[@class='sc-gdfaqJ cAnYFg']//button[2]")).click();
      	       try {
      	             // Use an explicit wait to wait for the element to be clickable            
      	           //   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(icname)));
      	              // If the element is found, click on it
      	             // element.click();
      	      } catch (Exception e) {
      	              // If the element is not found, scroll to it and then click
      	              ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id(icname)));
      	              driver.findElement(By.id(icname)).click();
      	          }     
      	      driver.findElement(By.xpath("//h5[text()=\"Continue\"]")).click();
      	      try {
      	        // Use an explicit wait to wait for the element to be clickable       
      	      //  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='sc-iGgWBj fsjzwa w-100 mt-2']")));
      	        // If the element is found, click on it
      	       // element.click();
      	      } catch (Exception e) {
      	        // If the element is not found, scroll to it and then click
      	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//button[@class='sc-iGgWBj fsjzwa w-100 mt-2']")));
      	        driver.findElement(By.xpath("//button[@class='sc-iGgWBj fsjzwa w-100 mt-2']")).click();
      	      }
      	      driver.findElement(By.xpath("//button[@class='sc-iGgWBj fsjzwa ReviewCardPopup___StyledButton-sc-5gc9g-46 jEwlvz']")).click();
      	      driver.findElement(By.xpath("//button[@class='sc-iGgWBj fsjzwa']")).click();
      	      //Proposal Page
      	      Thread.sleep(10);
      	      driver.findElement(By.xpath("//div[@id=\"dobundefined\"]//input")).sendKeys(Keys.BACK_SPACE);
      	      Thread.sleep(30);
      	      driver.findElement(By.xpath("//div[@id=\"dobundefined\"]//input")).sendKeys(DOB,Keys.ENTER);
      	      if (spouse.isEmpty()) {
        	      try {
        	    	 WebElement elementToClick = driver.findElement(By.xpath("(//div[@id='marital_statusundefined']//div[@class])[1]"));
     	            elementToClick.click();
     	            driver.findElement(By.xpath("//div[.='Single']")).click();   
        	        } catch (Exception e) {	
        	   
        	    	WebElement elementToClick = driver.findElement(By.xpath("(//div[@id='marital_statusundefined']//div[@class])[1]"));
  	            elementToClick.click();
  	        	driver.findElement(By.xpath("//div[.='Married']")).click();
        	         }}
      	         driver.findElement(By.xpath("//div[@id='address_line_1undefined']//div//input")).sendKeys("address1");
	             driver.findElement(By.xpath("//div[@id=\"address_line_2undefined\"]//div//input")).sendKeys("address2");
      	     // WebDriverWait waits12 = new WebDriverWait(driver,  Duration.ofSeconds(10)); 
      	     // WebElement elements12 = waits12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='next']")));
      	 //     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements12);
      	     // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elements12);
      	      driver.findElement(By.xpath("//button[text()=\"YES\"]")).click();
      	      driver.findElement(By.xpath("//input[@id=\"kyc_number\"]")).sendKeys(kyc);
      	      driver.findElement(By.xpath("//h6[text()=\"Verify\"]")).click();
      	      Thread.sleep(3000);
      	 //   WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
     	   //  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/button[1]"))).click();
      	      //driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/button[1]")).click();
      		  Thread.sleep(3000);
      		  driver.findElement(By.xpath("//h6[.='Proceed']")).click();
      	      //self
      	      Thread.sleep(10);
      	    driver.findElement(By.xpath("(//input[contains(@class,\"Height\")])[1]")).click();
      		driver.findElement(By.xpath(selfh)).click();
      	    driver.findElement(By.xpath("(//input[@placeholder='Weight (KG)'])[1]")).sendKeys(sweight);
      	    driver.findElement(By.xpath("//div[@id='occupationself']//input")).click();
      	    driver.findElement(By.xpath("//div[.='Self Employed General Service']")).click();
      	    //spouse 
      	  if (!spouse.isEmpty()) {
      	    try {
      	        driver.findElement(By.xpath("//span[text()=\"spouse\"]")).click();
      	 	    driver.findElement(By.xpath("//div[@id='namespouse']//div/input")).sendKeys("spouse spouse");
      	 	    driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']")).click();
      	 	    Thread.sleep(20);	 	    
      	 	    driver.findElement(By.xpath("(//input[@class='SearchableHeight__SearchInput-sc-v8u9an-2 gjLgyJ'])[3]")).click();
      	 	    driver.findElement(By.xpath("(//input[@class='SearchableHeight__SearchInput-sc-v8u9an-2 gjLgyJ'])[3]")).click();
      	 		driver.findElement(By.xpath(spouseh)).click();
      	 	    driver.findElement(By.xpath("(//input[@placeholder='Weight (KG)'])[2]")).sendKeys(Wweight);
      	 	    driver.findElement(By.xpath("//div[@id='occupationspouse']")).click();
      	 	    driver.findElement(By.xpath("//div[.='Homemaker,Student, Retirees, Pensioners and other dependents']")).click();
              } catch (Exception e) {}}
      	    //son
      	  if (!son.isEmpty()) {
      	      try {
      	      driver.findElement(By.xpath("//span[text()=\"son\"]")).click();
    	      driver.findElement(By.xpath("//div[@id=\"nameson1\"]//input")).sendKeys("son son");
    	      driver.findElement(By.xpath("//*[@id=\"dobson1\"]//div//button")).click();
    	      driver.findElement(By.xpath("(//div[@id=\"heightson1\"]//input[contains(@class,\"Height\")])[1]")).click();
    	      driver.findElement(By.xpath("(//div[@id=\"heightson1\"]//input[contains(@class,\"Height\")])[1]")).click();
    	      driver.findElement(By.xpath(sonh)).click();
    	      Thread.sleep(10);
    	      driver.findElement(By.xpath("//div[@id=\"weightson1\"]//input")).sendKeys(s1weight);
      	     } catch (Exception e) {}     	}
      	    //daughter
      	      if (!daughter.isEmpty()) {
      	      try {
      		  driver.findElement(By.xpath("//span[text()=\"daughter\"]")).click();
	 	      driver.findElement(By.xpath("//div[@id=\"namedaughter1\"]//input")).sendKeys("daugher daughter");
	 	      driver.findElement(By.xpath("//*[@id=\"dobdaughter1\"]//div//button")).click();
	 	      Thread.sleep(20);	 	    
	 	      driver.findElement(By.xpath("(//div[@id=\"heightdaughter1\"]//input[contains(@class,\"Height\")])[1]")).click();
	 	      driver.findElement(By.xpath("(//div[@id=\"heightdaughter1\"]//input[contains(@class,\"Height\")])[1]")).click();
	 	      driver.findElement(By.xpath(daughterh)).click();
	 	      driver.findElement(By.xpath("//div[@id=\"weightdaughter1\"]//input")).sendKeys(d1weight);	 	   
              } catch (Exception e) {}}
      	    //  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
      	    //  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("auto-continueCTA"))).click();
      	    
      	    try {
      	        WebElement elementToClick = driver.findElement(By.xpath("//button[@class='sc-iGgWBj fsjzwa RevisedPremiumPopup___StyledButton-sc-a6xfq4-5 bMDYEN w-100']"));
      	        elementToClick.click();
      	    } catch (Exception e) {
      	        // Element not displayed, skip and proceed to the next line
      	    }
      	      driver.findElement(By.xpath("//div[@class='Checbox___StyledDiv2-sc-1nuvkak-1 eobwkL round']")).click();
      	      driver.findElement(By.xpath("//div[@class='Panel__ChevronWrapper-sc-ehqph6-2 dMKVMW']")).click();
      	      Thread.sleep(50);
      	      driver.findElement(By.xpath("(//button[@name='next'])[2]")).click();
      	      
      	   
   	        try {
   	         if (!spouse.isEmpty()) {
   	        	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/section[2]/section/div[5]/div/div[1]/form/div[1]/div/input")).click();
   	        	 driver.findElement(By.xpath("//div[.='Spouse']")).click();
   	         }
   	         }catch(Exception e) {
   	        	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/section[2]/section/div[5]/div/div[1]/form/div[1]/div/input")).click();
   	        	 driver.findElement(By.xpath("(//div[@class='FormBuilder__Wrapper-sc-ojx2ld-1 dCxruA']//div[@class])[1]")).click();
      	    	 driver.findElement(By.xpath("//div[.='Father']")).click();
      	    	 driver.findElement(By.xpath("(//input[@class='TextInput__Input-sc-j3cl0c-2 ljRdzc'])[1]")).sendKeys("father father");
      	    	 driver.findElement(By.xpath("//input[@placeholder='DD-MM-YYYY']")).sendKeys(Keys.BACK_SPACE);
      	    	 driver.findElement(By.xpath("//input[@placeholder='DD-MM-YYYY']")).sendKeys(fDOB,Keys.ENTER);
   	         }
      	        driver.findElement(By.id("auto-continueCTA")).click();
      	        Thread.sleep(30000);
      	        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
      	       
      	       /* Thread.sleep(5000);
      	         driver.findElement(By.xpath("(//span[@type='checkbox'])[1]")).click();
      	    	 driver.findElement(By.xpath("(//span[@type='checkbox'])[2]")).click();
      	    	 driver.findElement(By.xpath("(//span[@type='checkbox'])[3]")).click(); 
      	    	 driver.findElement(By.xpath("//button[@class='proposalSummarystyled__PayNowButton-sc-1tiz0ss-20 bUEYHs']")).click();
      	    	 driver.findElement(By.xpath("//button[@class='infoActionBtn typography--variant-subheading1']")).click();
      	    	 Thread.sleep(5000);
      	    	 driver.navigate().back();
      	    	 driver.navigate().back();
      	    	 Thread.sleep(10000);*/
      	    
      	    	 // Perform any necessary assertions or further actions here
                 String Url = driver.getCurrentUrl();
                 currentRow.createCell(22).setCellValue(Url);
                 FileOutputStream fileOut = new FileOutputStream(".\\testdata\\sbi.xlsx");
                 workbook.write(fileOut);
                 System.out.println(Url);
                 fileOut.close();
                 currentRow.createCell(23).setCellValue("Pass");
                 String trace_id = driver.findElement(By.xpath("//div[@class='trace__ID']")).getText();
                 currentRow.createCell(21).setCellValue(trace_id);
                 FileOutputStream fileOut1 = new FileOutputStream(".\\testdata\\sbi.xlsx");
                 System.out.println(trace_id);
                 workbook.write(fileOut1);
                 fileOut1.close();
                
            }catch (Exception e) {
        	    // Capture screenshot
            	currentRow.createCell(23).setCellValue("Fail");
        	    if (driver != null) {
        	    	String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(0, 0, 0));
        	    	 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        	        // Save the screenshot to a desired location
        	        try {
        	            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Admin\\eclipse-workspace\\myproject\\screenshot\\screenshot" + timestamp +".png"));
        	            // Print success message if screenshot saved successfully
        	            System.out.println("Screenshot saved successfully");
        	        } catch (IOException ex) {
        	            System.out.println("Failed to save screenshot: " + ex.getMessage());
        	        } 
        	    }
        	    // Print current URL
        	    if (driver != null) {
        	    	  //url
        	    	  String Url = driver.getCurrentUrl();
                      currentRow.createCell(22).setCellValue(Url);
                      FileOutputStream fileOut = new FileOutputStream(".\\testdata\\sbi.xlsx");
                      workbook.write(fileOut);
                      System.out.println(Url);
                      fileOut.close();
                     //trace_id
                      String trace_id = driver.findElement(By.xpath("//div[@class='trace__ID']")).getText();
                      currentRow.createCell(21).setCellValue(trace_id);
                      FileOutputStream fileOut1 = new FileOutputStream(".\\testdata\\sbi.xlsx");
                      System.out.println(trace_id);
                      workbook.write(fileOut1);
                      fileOut1.close();
        	    }
        	    // Print the exception details
        	    e.printStackTrace();
        	} finally {
        	    if (driver != null) {
        	        driver.quit();
        	    }   
            }}}


