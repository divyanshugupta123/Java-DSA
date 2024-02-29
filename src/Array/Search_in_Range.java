package Array;
import java.util.*;
public class Search_in_Range {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int start=sc.nextInt();
        int end=sc.nextInt();
        int ans=search(a,target,start,end);
        System.out.println(ans);
	}
	static int search(int arr[],int target,int start,int end) {
		for(int i=start;i<=end;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
