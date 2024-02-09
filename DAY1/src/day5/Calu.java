package day5;

interface C {
	int a=10;
	int b=10;
	
	void add();
}

interface D {
	int x=2;
	int y=5;
	
	void mul();
}


public class Calu implements C,D {
		public void add() {
			System.out.println(a+b);
		}
		public void mul() {
			System.out.println(x*y);
		}
	public static void main(String[] args) {
		Calu cal=new Calu();
		cal.add();
		cal.mul();

	}

}
