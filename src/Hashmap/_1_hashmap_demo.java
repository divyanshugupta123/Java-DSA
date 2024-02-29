package Hashmap;

import java.util.*;

public class _1_hashmap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , Integer> map = new HashMap<>();
		map.put("divyanshu", 78);
		map.put("Manish",89);
		map.put("puneet", 45);
		map.put("Krish", 74);
		map.put("Harsh", 72);
		map.put("shagun", 7);
		map.put("mohit", 52);
		
		map.put("raj", 2);
		System.out.println(map.get("divyanshu"));
		System.out.println(map);
////		get the value corresponding to any key 
//		System.out.println(map.get("divyanshu"));
//		System.out.println(map.get("Ankur"));  // return null because key is not in map
////		contains : check whether the key is present or not 
//		System.out.println(map.containsKey("shagun"));
//		System.out.println(map.containsValue(73));
////		remove 
//		System.out.println(map.remove("mohit"));
//		System.out.println(map);
////		we can set null as a key and value both
//		map.put(null, 23);
		
		
		
		
		
		
		
//		TreeMap
		TreeMap<String , Integer> map1 = new TreeMap<>();
		map1.put("divyanshu", 78);
		map1.put("Manish",89);
		map1.put("puneet", 45);
		map1.put("Krish", 74);
		map1.put("Harsh", 72);
		map1.put("shagun", 7);
		map1.put("mohit", 52);
		map1.put("raj", 2);
		System.out.println(map1);
		
		
		
		
//		LinkedHashMap
		LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
		map2.put("divyanshu", 78);
		map2.put("Manish",89);
		map2.put("puneet", 45);
		map2.put("Krish", 74);
		map2.put("Harsh", 72);
		map2.put("shagun", 7);
		map2.put("mohit", 52);
		map2.put("raj", 2);
		System.out.println(map2);
		
		System.out.print(map.keySet()); // used to get all the key
		System.out.println();
		Set<String> key = map.keySet();
		for(String k : key) {
			System.out.println(k+" "+map.get(k));
		}
		
		
		
		
	}

}
