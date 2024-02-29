package Lec12;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();//in heap memory ArrayList is created
		System.out.println(list.size());
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
//		now if we want to add an element on specific index
		list.add(1,50);
//		indexing is from 0 to size
		System.out.println(list);
//      remove
		System.out.println(list.remove(3));// index is from 0 to size-1
		System.out.println(list);
//		to know the element on specific index
		System.out.println(list.get(1));
//		for Updation we have :
		list.set(2, 182);
	}

}
