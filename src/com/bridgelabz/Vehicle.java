package com.bridgelabz;

class Train {
	
}
public class Vehicle {

	//instance variable...
	private byte numberOfWheels; // 1
	byte numberOfGears; //
	String color;
	String brand;
	String flueType;
	byte numberOfSeats;
	String transportType;
	
	public void speedUp() {
		
	}
	
	private void applyingBreak() {
		
	}
	
	public Vehicle() {
		
	}
	
	@Override
	public String toString() {
		return "Vehicle [numberOfWheels=" + numberOfWheels + ", numberOfGears=" + numberOfGears + ", color=" + color
				+ ", brand=" + brand + ", flueType=" + flueType + ", numberOfSeats=" + numberOfSeats
				+ ", transportType=" + transportType + "]";
	}

	public static void main(String[] args) {
		//object or instance
		Vehicle bus = new Vehicle();
		bus.numberOfWheels = 6;
		bus.numberOfGears = 7;
		bus.color = "Red";
		bus.brand = "TATA";
		bus.flueType = "Diesel";
		bus.numberOfSeats = 48;
		bus.transportType = "Public Transport";
		
		Vehicle car = new Vehicle();
		car.numberOfWheels = 4;
		car.numberOfGears = 5;
		car.color = "Black";
		car.brand = "TATA";
		car.flueType = "Petrol";
		car.numberOfSeats = 5;
		car.transportType = "Private Transport";
		
		System.out.println(bus.numberOfSeats);
		car.applyingBreak();
	}
	
}
