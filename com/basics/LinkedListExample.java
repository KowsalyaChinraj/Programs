package com.basics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String>linkedlist=new LinkedList<String>();
		linkedlist.add("one");
		linkedlist.add("two");
		linkedlist.add("three");
		linkedlist.add("four");
		System.out.println(linkedlist);
		linkedlist.remove(1);
		System.out.println(linkedlist);
		linkedlist.addFirst("two");
		System.out.println(linkedlist);
		
		Iterator<String> iter=linkedlist.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		for (String str : linkedlist) {
			System.out.println(str);
			
			
		}
	}

}
