package Assignment;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        while(row<=n)
        {
            int i=1;
            int j=1;
            while(i<=star)
            {
                System.out.print(j+"\t");
                j++;
                i++;
            }
            row++;
            System.out.println();
            star++;
        }
    }
}
