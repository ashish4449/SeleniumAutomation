package convin;

public class Car {
	
	int speed;
	String model;
	
	
	public void start() {
		System.out.println(model+"car started at "+speed +" speed");
	}
	
	public void stop() {
		System.out.println(model+"Car stoped");
	}

	public void carDetails() {
		System.out.println("TOP speed of the car is " +speed );
		System.out.println("Model of the car is " +model);
	}
	
	
	public Car(int spd,String mod) {
		model = mod;
		speed=spd;
		System.out.println("constructor aa gya");
	}
}
