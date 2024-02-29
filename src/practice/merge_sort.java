package practice;

import java.util.Scanner;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		display(arr);
	}
	private static int[] mergesort(int[] arr,int low,int high) {
		
		if(low==high) {
			int[] ans = new int[1];
			ans[0]=arr[low];
			
		}
		int mid = (low+high)/2;
		int[] fs = mergesort(arr,low,mid);
		int[] ss = mergesort(arr,mid+1,high);
		return merge_two_sotrted_array(fs, ss);
	}
	private static int[] merge_two_sotrted_array(int[] a,int[] b) {
		int alen=a.length,blen=b.length,i=0,j=0,k=0;
		int[] ans = new int[alen+blen];
		while(i<alen && j<blen) {
			if(a[i]<b[i]) {
				ans[k]=a[i];
				i++;
				k++;
			}
			else {
				ans[k]=b[j];
				j++;
				k++;
			}
			
		}
		while(i<alen) {
			ans[k]=a[i];
			i++;
			k++;
		}
		while(j<blen) {
			ans[k]=b[j];
			j++;
			k++;
		}
		return ans;
	}
	private static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
