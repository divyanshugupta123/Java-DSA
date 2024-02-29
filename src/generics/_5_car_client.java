package generics;

import java.util.*;

//import java.util.Iterator;

public class _5_car_client {
	public static void main(String[] args) {
		_4_car[] arr = new _4_car[5];
		arr[0] = new _4_car(200,10,"white");
		arr[1] = new _4_car(1000,20,"black");
		arr[2] = new _4_car(345,3,"yellow");
		arr[3] = new _4_car(34,10,"grey");
		arr[4] = new _4_car(8907,6,"red");
		Arrays.sort(arr,new Comparator<_4_car>(){

			@Override
			public int compare(_4_car o1, _4_car o2) {
				// TODO Auto-generated method stub
				return o1.speed - o2.speed;
			}
			
		});
//		Sort(arr);
		display(arr);
	}
	public static void display(_4_car[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static <T extends Comparable <T>>void Sort(T[] arr) {

		for (int pass = 1; pass < arr.length; pass++) {
			for (int i = 0; i < arr.length - pass; i++) {

				if (arr[i].compareTo(arr[i+1])>0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
