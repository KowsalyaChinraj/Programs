package com.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		
		set.add("one");
		System.out.println(set);
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one");
		Set<String> setOne=new HashSet<String>(list);
		System.out.println(setOne);
		LinkedHashSet<String> linkedset=new LinkedHashSet<String>();
		linkedset.add("one");
		for(int i=0;i<10;i++) {
			linkedset.add("two"+i);
			setOne.add("two"+i);
			
		}
		System.out.println(linkedset);
		System.out.println(setOne);
	    TreeSet<String> treeset=new TreeSet<String>();
	    treeset.add("one");
	    treeset.add("two");
	    treeset.add("three");
	    treeset.add("four");
	    //treeset.add("five");
	   // treeset.add("six");
	    System.out.println(treeset);
	    NavigableSet<String> naviset=treeset.headSet("three",true);
	    System.out.println(naviset);
	    NavigableSet<String> navitailset=treeset.tailSet("three",true);
	    System.out.println(navitailset);
	    
			
	
	}

}
