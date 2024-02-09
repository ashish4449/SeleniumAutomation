import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.emulation.Emulation;
import org.openqa.selenium.devtools.v120.emulation.model.DisplayFeature;
import org.openqa.selenium.devtools.v120.emulation.model.ScreenOrientation;
import org.openqa.selenium.devtools.v120.page.model.Viewport;

public class cdpEmulate {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		DevTools devtool = driver.getDevTools();

		devtool.createSession();

		
		devtool.send(Emulation.setDeviceMetricsOverride(
			    414,                    // width
			    896,                    // height
			    30,                     // device scale factor
			    true,                   // mobile
			    Optional.<Number> empty(),       // screen width (Optional<Number>)
			    Optional.<Integer> empty(),       // screen height (Optional<Integer>)
			    Optional.<Integer> empty(),       // position x (Optional<Integer>)
			    Optional.<Integer> empty(),       // position y (Optional<Integer>)
			    Optional.<Integer> empty(),       // screen orientation type (Optional<Integer>)
			    Optional.<Boolean> empty(),       // display feature (Optional<Boolean>)
			    Optional.<ScreenOrientation> empty(),       // screen orientation (Optional<ScreenOrientation>)
			    Optional.<Viewport> empty(),       // viewport (Optional<Viewport>)
			    Optional.<DisplayFeature> empty()        // display feature (Optional<DisplayFeature>)
			));


		

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.className("navbar-toggler")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Library")).click();
	}
}
