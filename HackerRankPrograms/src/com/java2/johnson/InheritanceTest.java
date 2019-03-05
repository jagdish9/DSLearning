package com.java2.johnson;

class Vehicle{
	public void printSound(){
		System.out.println("Vehicle");
	}
}

class Car extends Vehicle{
	public void printSound(){
		System.out.println("Car");
	}
}

class Bike extends Vehicle{
	public void printSound(){
		System.out.println("Bike");
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle = new Vehicle();
		Bike b = (Bike)vehicle;
		vehicle.printSound();
		b.printSound();
	}

}
