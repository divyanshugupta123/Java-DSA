package Self;
import java.util.*;
public class Mirror_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of line");
		int n=sc.nextInt();
		int row=1;
		int star=n/2+1;
		int space=-1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			if(row<n/2+1) {
			star-=1;
			space+=2;
			}
			else {
				star+=1;
				space-=2;
			}
			row++;
			System.out.println();
		}
	}

}
