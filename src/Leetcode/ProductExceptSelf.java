package Leetcode;

import java.util.Arrays;

//PREFIX PRODUCT
public class ProductExceptSelf {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int[] ans=productExceptSelf(arr);
		System.out.println(Arrays.toString(ans));
		
	}
	
	public static int[] productExceptSelf(int[] arr) {
		int[] left=new int[arr.length];
		left[0]=1;
		for(int i=1;i<arr.length;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		int[] right=new int[arr.length];
		right[arr.length-1]=1;
		for(int i=right.length-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		for(int i=0;i<right.length;i++) {
			left[i]=left[i]*right[i];
		}
		return left;
	}

}
