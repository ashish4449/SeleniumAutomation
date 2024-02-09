package day4;

class parent{
	String Designation="teacher";
	String CollegeName="ABVGIET";
	
	void does() {
		System.out.println(Designation + CollegeName);
	}
}
class child extends parent{
	
}


public class Teacher {

	public static void main(String[] args) {
		child obj=new child();
		obj.does();
	}
}


