package data_driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDriven {
	

		
		public static void main(String[] args) throws IOException   {
		FileInputStream f = new FileInputStream("./testdata/commondata.property"); 	
		Properties p = new Properties();
	    p.load(f);
		String URL = p.getProperty("url");
		String UN = p.getProperty("username");
		String PW = p.getProperty("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PW);
		}
	}
/*advantages 
reusability and test script data 
modifcation of data in excel sheet it is hear
mantance of data in excel seet is easy ar 
test data can be created explicitely prior to the test execution 
we can test the application with huge data*/