package com.bridgelabz;

public class Methods {
	
	/*
	 * defination of method or function
	 * public <returnType> nameOfMethod(number of paraments){
	 * 
	 * }
	 */
	
	public void printTable(int num) {
		for(int i = 1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	
	public int multiplyInputs(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	public boolean isEvenOrOdd(int num) {
		boolean isEvenOrOdd = num % 2 == 0;
		return isEvenOrOdd;
	}

	public static void main(String[] args) {
		
		Methods methods =new Methods();
		
		System.out.println("Hello...");
		
		int num = 10;
		int num1 = 10;
		int num2 = 20;
		
		if(methods.isEvenOrOdd(num)) {
			System.out.println("Even...");
			//calling method...
			int result = methods.multiplyInputs(num, num1);
			System.out.println("Result = "+ result);
			methods.printTable(num1);
		}else {
			System.out.println("Odd value...");
			int result = methods.multiplyInputs(num, num2);
			System.out.println("Result = "+ result);
			methods.printTable(num2);
		}
	}
}

// no return no parameters
// return no parameters
// no return with paramenter
// return with parameters