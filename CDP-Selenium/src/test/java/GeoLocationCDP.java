import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.emulation.Emulation;



public class GeoLocationCDP {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	
	DevTools devtool=driver.getDevTools();
	
	devtool.createSession();
	
	//devtool.send(Emulation.setGeolocationOverride(30, 3, Optional.<Number> empty()));
	devtool.send(Emulation.setGeolocationOverride(
		    Optional.of((Number) 40),   // Wrap the int value with Optional.of
		    Optional.of((Number) 3),    // Wrap the int value with Optional.of
		    Optional.of((Number) 1)    // Optional<Number> for the third parameter
		));
	
	
	driver.get("https://my-location.org/");
	//driver.findElement(By.name("q")).sendKeys("facebook",Keys.ENTER);
	//Thread.sleep(2000);
	//driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
	
	

}
}
