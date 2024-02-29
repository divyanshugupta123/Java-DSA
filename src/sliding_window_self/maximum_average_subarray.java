package sliding_window_self;

public class maximum_average_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,12,-5,-6,50,3};
		int k=4;
		System.out.println(average(arr, k));
	}
	private static double average(int[] arr, int k) {
		double d=k;
		double avg = 0;
		int sum =0;
		double ans=0;
		for(int i =0;i<k;i++) {
			sum = sum+arr[i];
			avg=sum/d;
		}
		ans=avg;
		for(int i=k;i<arr.length;i++) {
			sum=sum+arr[i];
			sum=sum-arr[i-k];
			avg=sum/d;
			ans = Math.max(avg, ans);
		}
		return ans;
	}

}
