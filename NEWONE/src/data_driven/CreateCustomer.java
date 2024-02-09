package data_driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[4]/a/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[19]/div[1]")).click();
		
		FileInputStream fis=new FileInputStream("./testdata/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String Bname = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"customerLightBox_content\"]/div[2]/div[1]/div/div[1]/div[1]/input")).sendKeys(Bname);
	    String domin = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("//*[@id=\"customerLightBox_content\"]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/textarea")).sendKeys(domin);
	    Thread.sleep(3000);
	    driver.close();
	    
}
}