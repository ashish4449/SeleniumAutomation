package day1;

public class assignment2 {
public static void main(String[] args) {
	//int a[]= {100,200,300,400,500};
	
	//System.out.println(a.length);
	
	/*for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
}*/
	
	/*for(int i :a) {
		System.out.println(i);
	}*/
	
	/*int a[][]= {{10,20},{30,40},{50,60}};{
		System.out.println(a[0].length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		
		for(int i[]:a) {
			for(int j:i) {
				System.out.println(j);
			}
		
		}
	}*/
	
	int a[]= {100,200,300,400};
	int sum =0;
	int num =400;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]==num) {
			System.out.println("Number found");
			break;
		}
		sum = sum +a[i];
	}
	System.out.println(sum);
	
	
	String u="hello my name is ashish";
	
	
	System.out.println(u.length());
	
	
}
}
