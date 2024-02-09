package day6;

public class Excep {
	int a=10;
	
	public static void main(String[] args) {
		Excep c =new Excep();
		int z = c.a;
		int x[]=null;
		String s="124";
		int i=Integer.parseInt(s);
		//System.out.println(x.length);
		System.out.println(i);
		try {
			//System.out.println(z/0);
			
		}
		catch(Exception e){
			System.out.println("you got catched");
		}
		
	}

}
