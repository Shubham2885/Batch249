package com.bridgelabz;

public class ArrayDemo {

	public static void main(String[] args) {

		
//		int rollNo[]; //declaration of Array
//		rollNo = new int[size]; //initilization of Array
		int size = 10;
		int rollNo[] = new int[size];
		double randomValue[] = new double[10];
		char alphabet[] = new char[26];
		int lastIndex = size - 1;
		int initialIndex = 0;
		String studentNames[] = new String[10];
		Vehicle vehicles[] = new Vehicle[5];
		
		for(int i =0; i<rollNo.length;i++) {
			if(i%2==0) {
				rollNo[i] = i;
			}
		}
		
		for(int i =0; i<rollNo.length;i++) {
			System.out.println("rollNo["+i+"] = "+rollNo[i]);
		}
		
		for(int i =0; i<randomValue.length;i++) {
			double value = Math.random() * 1000;
			if(value > 100) {
				randomValue[i] = value;
			}else {
				value = Math.random() * 1000;
			}
		}
		
		for(int i =0; i<randomValue.length;i++) {
			System.out.println("randomValue["+i+"] = "+(int)randomValue[i]);
		}
		
		for(int i=0;i<alphabet.length;i++) {
			alphabet[i] = (char) (i+97);
		}
		
		for(int i =0; i<alphabet.length;i++) {
			System.out.println("alphabet["+i+"] = "+alphabet[i]);
		}
		
		for(int i=0;i<studentNames.length;i++) {
			studentNames[i] = "Student"+i;
		}
		
		for(int i =0; i<studentNames.length;i++) {
			System.out.println("studentNames["+i+"] = "+studentNames[i]);
		}
		
		for(int i=0;i<vehicles.length;i++) {
			Vehicle obj = new Vehicle();
			obj.numberOfGears = (byte)(7+i);
			obj.color = i%2==0 ? "Red" : "Black";
			obj.brand = i%2==0 ? "TATA" : "Maruti";
			obj.flueType = i%2==0 ? "Diesel" : "Perol";
			obj.numberOfSeats = (byte)(10+i);
			obj.transportType = i%2==0 ? "Public Transport" : "Private Transport";
			
			vehicles[i] = obj;
		}
		
		for(int i =0; i<vehicles.length;i++) {
			System.out.println("vehicles["+i+"] = "+vehicles[i]);
		}
	}
}
