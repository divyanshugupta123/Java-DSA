package Self;
import java.util.*;
public class Ques_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int star=1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int val=0;
			while(j<=star) {
				System.out.print(val+" ");
				j++;
				val+=1;
			}
			row++;
			System.out.println();space--;
			star++;
		}
		}
		
	}


