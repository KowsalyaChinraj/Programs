package com.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;



public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(1);
		System.out.println(list);
		
	
	
		}
	}


