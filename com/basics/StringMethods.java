package com.basics;

public class StringMethods {
	public static void main(String[] args) {
		String str1="welcome to google";
		String str2="  welcome to java training";
		String str3="";
		String str4="welcome to google";
		char c=str1.charAt(3);
		char c1=str2.charAt(5);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(str1.startsWith("wel"));
		System.out.println(str1.startsWith("to"));
		System.out.println(str1.endsWith("welcome"));
		System.out.println(str2.endsWith("training"));
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.isEmpty());
		System.out.println(str2.trim());
		String replace=str1.replace('o','l');
		System.out.println(replace);
		String s1=str1.toUpperCase();
		System.out.println(s1);
		System.out.println(str1.equals(str4));
	
	}

}
