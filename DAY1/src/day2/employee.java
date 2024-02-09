package day2;

public class employee {
	
	int eid;
	String name;
	double salary;
	String job_title;
	
	void display(){
		System.out.println(eid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(job_title);
	}

	public static void main(String[] args) {
		employee obj1=new employee();
		obj1.eid=1;
		obj1.name="Ashish";
		obj1.salary=11222.6;
		obj1.job_title="QA";
		obj1.display();
		
		employee obj2=new employee();
		obj2.eid=2;
		obj2.name="xyz";
		obj2.salary=1222.6;
		obj2.job_title="WEQA";
		obj2.display();
	
	}

}
