package com.basics;

public class StringCode {
	public static int getLetterNo(char letter) {
		return(int) letter-64;
	}
	public static int difference(int a,int b) {
		int d=a-b;
		if(d<0) 
			d=d*(-1);
		return d;
	}
	public static void main(String args[]) {
		String input1= "WORLD WIDE WEB";
		char c1,c2;
		int n1,n2;
		int counter;
		int center;
		int sum=0;
		int output=0;
		
		String[] words=input1.toUpperCase().split("\\s");
		String total="";
		for(String w:words) {
			counter=0;
			center=w.length()/2;
			sum=0;
			while(counter<center) {
				c1=w.charAt(counter);
				c2=w.charAt(w.length()-counter-1);
				counter++;
				n1=getLetterNo(c1);
				n2=getLetterNo(c2);
				sum=sum+difference(n1,n2);
			}
			if(w.length()%2!=0) 
				sum=sum+getLetterNo(w.charAt(center));
				total=total+sum;
	}
		
     output=Integer.valueOf(total);
		System.out.println(output);
	}
}

		


