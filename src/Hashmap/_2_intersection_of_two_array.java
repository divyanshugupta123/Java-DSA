package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class _2_intersection_of_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {4,9,5};
		int[] arr2 = {9,4,9,8,4};
		
	}
	public static int[] Intersection(int[] arr1,int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i  = 0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]+1));
			}
			else {
				map.put(arr1[i], 1);
			}
			
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i])&& map.get(arr2[i])>0) {
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i])-1);
			}
		}
		int[] ans = new int[list.size()];
		for(int a :list) {
			ans[a] = list.get(a);
		}
		return ans;
	}

}
