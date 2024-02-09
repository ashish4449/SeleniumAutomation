package day5;

interface A {
	int a=20;
	int b=30;
	
	void sum();
}

public class B implements A{
	public void sum() {
		System.out.println(a+b);
	}
		public static void main(String[] args) {
			B a=new B();
			a.sum();
		}
}
