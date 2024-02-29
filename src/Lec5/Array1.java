package Lec5;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
//		it store automatically a default value null
//		int[] arr;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		display(a);
		
	}
	public static void display(int a[]) {
		System.out.println(Arrays.toString(a));
		
		}

}
