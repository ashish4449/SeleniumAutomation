package convin;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		Driver.manage().window().maximize();
		
		WebElement SelectElement= Driver.findElement(By.id("searchDropdownBox"));
		
		Select select=new Select(SelectElement);
			
			
		List<WebElement> AllElements = select.getOptions();
				
		int totalOptions = AllElements.size();
		
		System.out.println("Total no of items"+ totalOptions);
				    
		    
		    for (int i = 0; i < totalOptions; i=i+2) {
	            WebElement option = AllElements.get(i);

	            Thread.sleep(1000);
	            System.out.println(option.getText());
	        }
		}
	    
}
