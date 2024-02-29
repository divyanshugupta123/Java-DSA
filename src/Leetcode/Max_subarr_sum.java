//kadane's Algorithem : if cumulative sum become negative then make it 0

package Leetcode;

public class Max_subarr_sum {

	public static void main(String[] args) {
		int[] arr= {-2,-5,-6,-5,-7};
		System.out.println(maxsum(arr));
	}
	private static int maxsum(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans=Math.max(ans,sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}
