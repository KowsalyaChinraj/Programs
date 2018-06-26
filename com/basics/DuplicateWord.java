package com.basics;

import java.util.Scanner;

public class DuplicateWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String word = sc.nextLine();
		String str = word.toLowerCase();
		String[] w = str.split("\\s");
		int count = 0;
		for (int i = 0; i < w.length; i++) {
			count = 0;
			for (int j = 0; j < w.length; j++) {
				if (w[i].equals (w[j])) {
					count++;
				}

			}
		}
		if (count > 1) {
			System.out.println(count);
		}

	}

}
