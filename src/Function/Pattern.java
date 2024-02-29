package Function;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		pattern();
		pattern();
		pattern();
		pattern();
	}
	
	static void pattern(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print(row+" ");
				i++;
			}
			star++;
			row++;
			System.out.println();
		}
	}

}
