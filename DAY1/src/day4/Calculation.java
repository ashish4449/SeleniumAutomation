package day4;

public class Calculation {

	void sum(int x,int y){
		System.out.println(x+y);
	}
	void sum(int x,int y, int z) {
		System.out.println(x+y+z);
	}
	void sum(double x,double y) {
		System.out.println(x+y);
	}
	void sum(double x,double y, double z) {
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		cal.sum(12,13,14);
	}

}
