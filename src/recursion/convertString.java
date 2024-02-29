package recursion;
import java.util.*;
public class convertString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String str=sc.next();
            char[] arr=str.toCharArray();
            stringPrint(0,arr,"");
        }
	}
	private static void stringPrint(int i,char[] arr,String ans){
        if(i==arr.length){
            System.out.print(ans+" ");
//            return;
        }
        
        if(arr[i]=='?'){
            stringPrint(i+1,arr,ans+'0');
            stringPrint(i+1,arr,ans+'1');
        }
    }

}
