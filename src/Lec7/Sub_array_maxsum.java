package Lec7;

public class Sub_array_maxsum {

	public static void main(String[] args) {
		int[] arr= {2,-5,-6,5,7};
		int ans=maxsum(arr);
		System.out.println(ans);
	}
	private static int maxsum(int[] arr){
		int ans=arr[0];
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				ans=Math.max(sum, ans);
			}
		}
		return ans;
	}

}
