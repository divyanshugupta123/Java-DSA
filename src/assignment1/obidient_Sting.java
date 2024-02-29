package assignment1;

import java.util.*;
public class obidient_Sting {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(answer(s,0));
    }
    public static boolean answer(String str,int i){
        if(i==str.length()-1 || i==str.length())
        {
            return true;
        }
        boolean x=true;
        boolean y=true;
        boolean z=true;
        if(str.charAt(i)=='a' && str.charAt(i+1)=='a')	 x=answer(str,i+1);
        else if(i<str.length()-2 && str.charAt(i)=='a' && str.charAt(i+1)=='b' && str.charAt(i+2)=='b')	y=answer(str,i+2);
        
        else if(str.charAt(i)=='b' && str.charAt(i+1)=='a')	z=answer(str,i+1);
        
        else	return false;
        
        boolean a=x&&y&&z;
        return a; 
    }
}