package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class intersection_of_two_arrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,4,3,1,5};
		int[] arr2 = {4,5,3,1,2,2,1,2,3};
		
	}
	public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums1.length ; i++) {
        	if(map.containsKey(nums1[i])) {
        		map.put(nums1[i], map.get(nums1[i])+1);
        		
        		
        	}
        	else {
        		map.put(nums1[1], 1);
        		
        	}
        }
        List<Integer> ll = new ArrayList<>();
        
        for(int i = 0;i<nums2.length;i++) {
        	if(map.containsKey(nums2[i]) && map.get(nums2[i])>0) {
        		ll.add(nums2[i]);
        		map.put(nums2[i], map.get(nums2[i])-1);
        		
        		
        	}
        }
        int[] arr = new int[ll.size()];
        for(int i  = 0 ;i <arr.length;i++) {
        	arr[i] = ll.get(i);
        }
        return arr;
    }

}
