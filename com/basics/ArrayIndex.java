package com.basics;

public class ArrayIndex {
	public static void main(String[] args) {
		int[] Array = { 5, 8, 3, 7 , 9, 10, 11 , 12};
		int Element = 10;
		int Index=0;

		for (int i = 0; i < Array.length; i++)
		{
		     if (Element == Array[i])
		     {
		         Index = i;
		     }
		}
		System.out.println(Index);
	}

}
