package Self;
import java.util.*;
public class Pattern_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 2 * n - 1;
        int space = 0;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                if (j % 2 == 0) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            space += 1;
            star -= 2;
            row++;
            System.out.println();
        }
	}

}
