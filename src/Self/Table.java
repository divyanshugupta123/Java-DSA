package Self;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range from Where to Where you want to print the table");
		int m=sc.nextInt();
		int n=sc.nextInt();
		while(m<=n) {
			System.out.println("Table of "+m+" : ");
			int i=1;
			while(i<=10) {
				System.out.println(m+" * "+i+" = "+(m*i));
				i++;
			}
			System.out.println();
			
			m++;
		}
	}

}
