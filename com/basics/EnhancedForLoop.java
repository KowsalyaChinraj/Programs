package com.basics;

public class EnhancedForLoop {
	public static void main(String[] args) {
	String[] s= {"kowsi","kowsalya","kowsalya c"};	
	
	int[] n= {13,23,45,78,67,90};
	for(int number:n) {
		System.out.print(number);
		System.out.print(",");
	}
	System.out.print("\n");
	for(String str:s) {
		System.out.print(str);
		System.out.print(",");
		
	}
		
	}

}
