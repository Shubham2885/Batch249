package com.bridgelabz;

public class StringDemo {

	public static void main(String[] args) {
		
		//string litrals
		String name = "Shubham" + " Lead Mentor";
		String name2 = "Shubham";
		String name1 = new String("Amol"); // string litral inside string pool area and object inside heap area
		
		System.out.println(name2.charAt(5));
		System.out.println(name2.replace('m', 'M'));
		System.out.println(name2.substring(3, 5));
		
		char str[] = name2.toCharArray();
		for(int i = str.length-1; i>-1;i--) {
			System.out.print(str[i]);
		}
	}
}
