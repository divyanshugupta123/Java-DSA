package Self;
import java.util.*;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=2*n-3;
        int stars=1;
        while(row<=n){
            int i=1;
            while(i<=stars){
                if(row==n && i==stars) break;
                System.out.print("*"+" ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            i=1;
            while(i<=stars){
                System.out.print("*"+" ");
                i++;
            }
            System.out.println();
          
            space-=2;
            stars++;
            row++;

        }
	}

}
