package com.basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExamples {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("sathya",98);
		map.put("kowsalya",93);
		map.put("shree",91);
		map.put("ramya",96);
		map.put("dhivya",92);
		System.out.println(map);
		Map<String,Integer> maplink=new LinkedHashMap<String,Integer>();
		maplink.put("sathya",98);
		maplink.put("kowsalya",93);
		maplink.put("shree",91);
		maplink.put("ramya",96);
		maplink.put("dhivya",92);
		System.out.println(maplink);
		
	}

}
