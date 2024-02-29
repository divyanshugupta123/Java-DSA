//counting sort is used when the data is repeated the complexity of counting sort is order of n

// we have to maintain a array and set the frequency of the element on the given index 




package Graph;

import java.util.Arrays;

public class _1_counting_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,1,0,1,2,5,4,0,2,8,7,9,2,6,1,9};
		arr = Sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] Sort(int[] arr) {
		int max = arr[0];
		for(int i = 1;i <arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int[] fre = new int[max+1];
		for(int i = 0;i<arr.length;i++) {
			fre[arr[i]]++;
		}
//		calculating the cumulative sum 
		for(int i = 1 ;i <fre.length;i++) {
			fre[i] = fre[i-1] + fre[i];
			
		}
		
		int[] ans = new int[arr.length];
		for(int i = arr.length - 1 ; i >= 0; i--) {
			int c = fre[arr[i]] - 1;
			ans[c] = arr[i];
			fre[arr[i]]--;
		}
		return ans;
		
	}
}
