package Array;
import java.util.*;
public class Linear_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=search(a,target);
        System.out.println(ans);

	}
	static int search(int arr[] , int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
