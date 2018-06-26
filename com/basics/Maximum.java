package com.basics;

public class Maximum {
	public static void main(String args[]) {
	    int a[]= {5,34,78,2,45,1,99,23};
	    int m1=0,m2=0;
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]<0) {
	    		a[i]=(a[i]);
	    	}
	        if(m1<a[i]) {
	        m2=m1;
	        m1=a[i];
	    }
	        else if (m2<a[i]) {
	            m2=a[i];
	        }

	    }
	    System.out.println(m1);
	    System.out.println(m2);
	    }
}


