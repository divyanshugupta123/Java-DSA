package Leetcode;

public class subarray_product_less_than_k {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,3};
		int k=10;
		System.out.println(count_Sub_Array(arr, k));
	}
	private static int count_Sub_Array(int[] arr,int k) {
		int si=0;
		int ei=0;
		int ans=0;
		int p=1;
		while(ei<arr.length) {
			p=p*arr[ei];
			while(p>=k && si<=ei) {
				p/=arr[si];
				si++;
			}
			ans=ans+(ei-si+1);
			ei++;
		}
		return ans;
	}

}
