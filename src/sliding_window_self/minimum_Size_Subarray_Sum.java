package sliding_window_self;

public class minimum_Size_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,2,4,3};
		int k = 7;
		System.out.println(minimumlength(arr, k));
	}
	private static int minimumlength(int[] arr, int k) {
		int si=0;
		int ei=0;
		int ans=0;
		int sum=0;
		while(ei<arr.length) {
			sum=sum+arr[ei];
			
			while(sum>=k) {
				ans=ei-si+1;
			}
			ei++;
			return Math.min(ans, sum);
		}
		return 0;
	}

}
