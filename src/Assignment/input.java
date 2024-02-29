package Assignment;

import java.util.*;
public class input {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true)
        {
            int n=sc.nextInt();
            sum+=n;
            System.out.println(n);
            if(sum<0)
            break;
        }
    }
}