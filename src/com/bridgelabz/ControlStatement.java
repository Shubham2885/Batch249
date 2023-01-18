package com.bridgelabz;

import java.util.Scanner;

public class ControlStatement {
	
	public boolean isNeutral(int number) {
		return number == 0;
	}

	public boolean isPositiveOrNegative(int number) {
		return number > 0;
	}
	
	public void printTable(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println((number * i));
		}
	}
	
	public int getSumOfDigit(int number) {
		int sum = 0;
		while(number != 0) {
			int rem = number % 10;
			sum = sum + rem;
			number = number / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// wap to find positive number or not, if number is positive print table of that number.
		// if number is positive then find sum of digit of number (1234 = 10)
		// number as input
		// number is greater than 0 then it's +ve else -ve
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			ControlStatement controlStatement = new ControlStatement();
			System.out.println("Enter the number");
			int number = scanner.nextInt();
			
			System.out.println("In Program input is "+ number);
			if(controlStatement.isNeutral(number)) {
				System.out.println("it's neutral...");
			}else if(controlStatement.isPositiveOrNegative(number)) {
				System.out.println("+ve");
				
				System.out.println("table of "+number);
				controlStatement.printTable(number);
				
				int sum = controlStatement.getSumOfDigit(number);
				System.out.println("sum of digit is = "+sum);
			}else {
				System.out.println("-ve");
			}
			
			System.out.println("Do you want to contineu... press 1");
			i = scanner.nextInt();
		}while(i == 1);
	}
}
