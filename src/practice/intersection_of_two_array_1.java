package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class intersection_of_two_array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,2,2,1};
		int [] arr2 = {2,2};
		
	}
	
	public static int[] intersection(int[] arr1, int[] arr2) {
		        HashSet<Integer> set1 = new HashSet<>();
		        HashSet<Integer> set2 = new HashSet<>();

		        // Add all elements from nums1 to set1
		        for (int num : arr1) {
		            set1.add(num);
		        }

		        // Add elements from nums2 to set2 if they exist in set1
		        for (int num : arr2) {
		            if (set1.contains(num)) {
		                set2.add(num);
		            }
		        }

		        // Convert set2 to an array
		        int[] result = new int[set2.size()];
		        int index = 0;
		        for (int num : set2) {
		            result[index++] = num;
		        }

		        return result;
		    
		

    }

}
