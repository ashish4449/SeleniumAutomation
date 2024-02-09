package udm;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class Udmy {
  public static void main(String[] args) {
	WebDriver Driver= new ChromeDriver();
	
	Driver.get("http://qatechhub.com");
	
	Driver.getTitle();
	
	
	System.out.println(Driver.getTitle());
	
	if(Driver.getTitle() =="QA Automation Tools Trainings and Tutorials | QA Tech Hub ") {
		System.out.println("PASS");
		
	}else {
		System.out.println("FAIL");
	}
	String url = "https://www.facebook.com";
	Driver.navigate().to(url);
	Driver.navigate().back();
	
	System.out.print(Driver.getTitle());
	
	Driver.navigate().forward();
	Driver.navigate().refresh();
	
	Driver.quit();

}
}
