package com.bridgelabz;

public class Pattern {

	public static void main(String[] args) {
		// print L
		
		//no of line *
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//no of line A
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int k=10-(i*2);k>0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int k=10-(i*2);k>0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//*
//**
//***
//****
//*****
//A
//BB
//CCC
//DDDD
//EEEEE

//    *
//   **
//  ***
// ****
//*****