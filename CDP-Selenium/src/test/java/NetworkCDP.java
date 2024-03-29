import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.network.Network;
import org.openqa.selenium.devtools.v119.network.model.Request;
import org.openqa.selenium.devtools.v119.network.model.Response;


public class NetworkCDP {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		DevTools tool=driver.getDevTools();
		
		tool.createSession();
		
		tool.send(Network.enable(Optional.<Integer> empty(), Optional.<Integer> empty(), Optional.<Integer> empty()));
		
		tool.addListener(Network.requestWillBeSent(), request->{
			
			Request req=request.getRequest();
			
			System.out.println(req.getUrl());
			
		});
		
		
		
		
		tool.addListener(Network.responseReceived(), response->
		
		{
			Response rep=response.getResponse();
			System.out.println(rep.getStatus()); 
			
			if(rep.getStatus().toString().startsWith("4")) {
				System.out.println("There is a failure with"+rep.getStatus()+rep.getUrl());
			}
			
		});
		
		driver.get("https://uathealth.renewbuyinsurance.in/health/input/basic-details");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sc-lmJFLr byIOee']")).click();
		

	}

}
