package Assignment;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int d=0,x;
		for(int i=1;i<=n1;i++)
		{
			for(int j=(d+i);j<=1001;j++)
	        {
	            x=(3*j)+2;
	            if(x%n2!=0) {
	            	System.out.println(x);
	            	break;
	            }
	            else {
	            	d++;
	            }
	}
		}
	}
}
