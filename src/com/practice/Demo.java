package com.practice;

import com.bridgelabz.Vehicle;

public class Demo {

	public static void main(String[] args) {
		//Java Program to reverse an array
		int array[] = {4, 5, 6, 7, 8, 1, 2};
		System.out.println("Even	Odd");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2 ==0) {
				System.out.print(array[i]+"\t");
			}else {
				System.out.print(array[i]);
				System.out.println();
			}
		}
		
	}
}
