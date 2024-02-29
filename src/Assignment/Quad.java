package Assignment;

import java.util.Scanner;

public class Quad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=(b*b)-(4*a*c);
		if(d>0) {
			System.out.println("Real and Distinct");
			int root1=(int) ((-b+Math.sqrt(d))/2*a);
			int root2=(int) ((-b-Math.sqrt(d))/2*a);
			if(root1>root2) {
				int temp=root1;
				root1=root2;
				root2=temp;
			}
			System.out.println(root1+" "+root2);
		}
		else if(d==0) {
			System.out.println("Real and Equal");
			int root1=(int) ((-b+Math.sqrt(d))/2*a);
			int root2=(int) ((-b-Math.sqrt(d))/2*a);
			System.out.println(root1+" "+root2);
		}
		else {
			System.out.println("Imaginary");
		}
	}

}
