package Assignment;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int c=1;
		int evsum=0;
		int oddsum=0;
		while(n>0) {
			int r=n%10;
			if(c%2==0) {
				
				evsum+=r;
			}
			else {
				oddsum+=r;
			}
			c++;
			
			n/=10;
		}
		System.out.println(oddsum);
		System.out.println(evsum);
	}

}
