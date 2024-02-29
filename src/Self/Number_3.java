package Self;
import java.util.*;
public class Number_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			int i=1;
			int val=n;
			while(i<=star) {
				System.out.print(val+" ");
				val--;
				i++;
			}
			System.out.println();
			row++;
			star++;
		}
	}

}
