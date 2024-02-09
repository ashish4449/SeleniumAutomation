package udm1;

import java.io.Console;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {

	public static void main(String[] args) {
		
//		WebDriver Driver = new ChromeDriver();
//		
//		Driver.get("https://www.google.com/");
		
		
		int[] nono2 = {1,2,4,5,6,7,8,9,10,122};
		
		
		for(int i=0;i<nono2.length;i++) {
			if(nono2[i] % 2 == 0) {
				break;
			}
		}
		
		
		for(int i=0;i<nono2.length;i++) {
			if(nono2[i] % 2 == 0) {
				System.out.println(nono2[i]);
			}
		}
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("foiur");
		a.add("five");
		
		System.out.println(a.get(3));
		System.out.println(a.size());
		
		System.out.println(a.contains("two"));
		
		for(String te :a) {
			System.out.println(te);
		}
		
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)=="foiur") {
				System.out.println("you find oyur value ="+a.get(i));
		}
			else{
				System.out.println("Sorry");
			}
		}
		
				
		
		
}
	}