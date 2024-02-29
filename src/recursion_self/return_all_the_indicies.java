package recursion_self;
import java.util.*;
public class return_all_the_indicies {

	public static void main(String[] args) {
		System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		printArray(arr,0,target);
	}
	private static void printArray(int[] arr, int i,int target){
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    if(i==arr.length){
	        System.out.print(list);
	    }
	    if(arr[i]==target){
	        System.out.println(list.add(i));
	    }
	    printArray(arr,i+1,target);
	}
}
