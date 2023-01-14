package com.bridgelabz;

public class Operators {

	public static void main(String[] args) {
		
		int x = 15;
		int y = 61;
		int z = 120;
		
		System.out.println("x>y = "+(x>y));
		System.out.println("x<y = "+(x<y));
		System.out.println("x>=y = "+(x>=y));
		System.out.println("x<=y = "+(x<=y));
		System.out.println("x==y = "+(x==y));
		System.out.println("x!=y = "+(x!=y));
		
		if(x>y && x>z) {
			System.out.println("x is greater");
		}else if(y>x && y>z) {
			System.out.println("y is greater");
		}else {
			System.out.println("z is greater");
		}
		
		System.out.println( x > y && x > z ? "x is greater" : y>x && y>z ? "y is greater" : "z is greater");
		
//		x = x + 1;
//		int y = x++; // postfix (increment op)
//		System.out.println(y);
//		System.out.println(x);
		
//		int y = ++x; // prefix (increment op)
//		System.out.println(y);
//		System.out.println(x);
		
//		int y = x--; // postfix (decrement op)
//		System.out.println(y);
//		System.out.println(x);
		
//		int y = --x; // prefix (increment op)
//		System.out.println(y);
//		System.out.println(x);
	} 
}

//in Logical AND
//OP1 Op2 Re
//T	T	T
//F	T	F
//T	F	F
//F	F 	F
//
//in Logical OR
//OP1 Op2 Re
//T	T	T
//F	T	T
//T	F	T
//F	F	F