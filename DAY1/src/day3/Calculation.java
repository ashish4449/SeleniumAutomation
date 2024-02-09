package day3;

public class Calculation {
	
	
	int x;
	int y;
	int z;
	
	
	Calculation() {
	 x=30;
	 y=30;
	 z=40;
	}
	void sum() {
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		Calculation Cal = new Calculation();
		Cal.sum();
		
	}

}
