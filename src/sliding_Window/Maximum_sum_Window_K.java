package sliding_Window;

import java.util.Scanner;

public class Maximum_sum_Window_K {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int[] arr= {1,4,5,6,7,8,2,3,9,1,2,5};
		System.out.println(Maximum_Sum(arr, 3));
	}
	private static int Maximum_Sum(int[] arr,int k) {
		int max=0;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		max=sum;
		for(int i=k;i<arr.length;i++) {
			sum=sum+arr[i];// window size Grow
			sum=sum-arr[i-k];//window size shrink
			max=Math.max(max, sum);
		}
		return max;
	}

}
