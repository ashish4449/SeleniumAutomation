import java.io.IOException;
import java.util.ArrayList;

public class tryone {
	
	public static void main(String[] args) throws IOException {
		DrivenExcel data= new DrivenExcel();
		
	ArrayList<?> d=data.test("login");
	System.out.println(d.get(0));
	System.out.println(d.get(1));
	System.out.println(d.get(2));
	System.out.println(d.get(3));
	
	}
}
