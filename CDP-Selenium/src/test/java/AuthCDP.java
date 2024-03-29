import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class AuthCDP {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	DevTools tool=driver.getDevTools();
	tool.createSession();
	
	 Predicate<URI> Predicateuri=uri -> uri.getHost().contains("httpbin.org");
	 
	 // ((HasAuthentication)driver).register(Predicateuri,UsernameAndPassword.of("foo", "bar"));
	 
	 driver.get("http://httpbin.org/basic-auth/foo/bar");
	 
}
}
