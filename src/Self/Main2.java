package Self;

import java.util.*;
public class Main2 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] a=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            a[i]=arr[i]*arr[i];
        }
        Arrays.sort(a);
        for(int i=0;i<arr.length;i++) {
        	System.out.println(a[i]);
        }
    }
}