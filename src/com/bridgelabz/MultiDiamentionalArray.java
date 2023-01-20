package com.bridgelabz;

import java.util.Scanner;

public class MultiDiamentionalArray {
	
	public void getInputFromUser() {
		int row;
		int col;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of row");
		row = scanner.nextInt();
		System.out.println("Enter the size of col");
		col = scanner.nextInt();

		int numbers[][] = new int[row][col];

		// row...
		for(int i=0;i<row;i++) {
			// col
			for(int j=0;j<col;j++) {
				System.out.println("Enter element for ["+i+"]["+j+"]");
				numbers[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("User Entered Array...");

		// row...
		for(int i=0;i<row;i++) {
			// col
			for(int j=0;j<col;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int row = 2;
		int col = 2;
		int twoDArray[][] = new int[row][col];
		char matrix[][] = new char[3][3];

		String students[][] = {
				{"Shubham", "Amol", "Virat"}, 
				{"Rahul", "Mayur", "Rohit"},
				{"Hardik", "Suresh", "MSD"}
		};

		twoDArray[0][0] = 4;
		twoDArray[0][1] = 6;
		twoDArray[1][0] = 7;
		twoDArray[1][1] = 9;

		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				//				System.out.print("twoDArray["+i+"]["+j+"] = "+twoDArray[i][j]+"\t");
				System.out.print(twoDArray[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(j%2 == 0) {
					matrix[i][j] = 'O';
				}else {
					matrix[i][j] = 'X';
				}
			}
		}

		// row...
		for(int i=0;i<students.length;i++) {
			// col
			for(int j=0;j<students.length;j++) {
				System.out.print(students[i][j]+" ");
			}
			System.out.println();
		}
		
		MultiDiamentionalArray multiDiamentionalArray = new MultiDiamentionalArray();
		multiDiamentionalArray.getInputFromUser();
	}
}
//
//2 5
//1 2
//
//2 5 3
//1 2 2
//
//2 5
//1 2
//3 4
//
//2 5 4
//1 2 5
//3 4 6

//X O X
//O X X
//O O X