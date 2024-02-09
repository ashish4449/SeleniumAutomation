package convin;

public class Pattern {
	public static void main(String[] args) {
		
		int row = 6;  // Total no of iterations
		
		for(int i=1;i<row;i++) {			
		for(int j=1;j<row-i;j++) {  // this loop is for printing the Spaces
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {  // this loop is for printing the numbers
			System.out.print(k);
	}
		System.out.println();  // this is for moving to the next line after every iteration
		}
		
		
	}
}	

