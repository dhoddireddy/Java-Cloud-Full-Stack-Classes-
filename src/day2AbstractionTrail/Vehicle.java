package day2AbstractionTrail;

abstract class Vehicle {
	abstract void Start();
}


class Car extends Vehicle{

	@Override
	void Start() {
		// TODO Auto-generated method stub
		System.out.println("Car starts with key");
	}
}
class Bike extends Vehicle{

	@Override
	void Start() {
		// TODO Auto-generated method stub
		System.out.println("Bike starts with Kick");
	}
	
}