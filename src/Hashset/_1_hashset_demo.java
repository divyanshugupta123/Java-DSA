package Hashset;

import java.util.*;

public class _1_hashset_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(4);
		set.add(41);
		set.add(23);
		set.add(2);
		set.add(11);
		System.out.println(set);
////		we cannot get any element in any set
//		System.out.println(set.contains(41));
//		System.out.println(set.contains(401));
//		System.out.println(set.remove(2));
//		System.out.println(set);
//		System.out.println(set.size());
		
		
		
//		TreeSet 
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(4);
		set1.add(41);
		set1.add(23);
		set1.add(2);
		set1.add(11);
		System.out.println(set1);
		
		
//		LinkedHashSet
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(4);
		set2.add(41);
		set2.add(23);
		set2.add(2);
		set2.add(11);
		System.out.println(set2);
		
		for(int val:set) {
			System.out.print(val+" ");
		}
		
		
		
		
	}

}
