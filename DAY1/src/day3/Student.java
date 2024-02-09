package day3;

public class Student {
	
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
	
	void getStuData(int id, String name) {
		SID=id;
		Sname=name;
	}
	 void getStuMarks(int subject1,int subject2,int subject3) {
		Sub1=subject1;
		Sub2=subject2;
		Sub3=subject3;
	}
	 void totalMarks() {
		 System.out.print(SID + Sname);
		 System.out.println(Sub1+Sub1+Sub1);
	 }
	

	public static void main(String[] args) {
		Student std1=new Student();
		std1.getStuData(101, " Ashish ");
		std1.getStuMarks(10, 20, 30);
		std1.totalMarks();
		
		Student std2=new Student();
		std2.getStuData(102, " xyz ");
		std2.getStuMarks(30, 40, 50);
		std2.totalMarks();
		

	}

}
