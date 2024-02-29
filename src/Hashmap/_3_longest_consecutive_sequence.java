package Hashmap;

import java.util.HashMap;

public class _3_longest_consecutive_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,3,7,2,5,8,4,6,0,1};
		System.out.println(consecutive_seq(arr));
	}
	public static int consecutive_seq(int[] arr) {
		HashMap<Integer , Boolean> map = new HashMap<>();
		for(int i = 0 ; i<arr.length;i++) {
			if(map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			}
			else {
				map.put(arr[i], true);
			}
			if(map.containsKey(arr[i]+1)) {
				map.put(arr[i]+1,false) ;
			}
		}
		int ans  = 0;
		for(int key : map.keySet()) {
			if(map.get(key)) {
				int count = 0;
				while(map.containsKey(key)) {
					count++;
					key++;
				}
				ans = Math.max(ans, count);
			}
		}
		return ans;
	}

}