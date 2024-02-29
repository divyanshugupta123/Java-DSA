package Leetcode;
import java.util.*;
public class spiral_anticlockwise {

	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int m=sc.nextInt();
		        int[][] arr=new int[n][m];
		        for(int i=0;i<arr.length;i++)
		        {
		            for(int j=0;j<arr[0].length;j++)
		            {
		                arr[i][j]=sc.nextInt();
		            }
		        }
		        spiral(arr);
		    }
		    private static void spiral(int[][] arr)
		    {
		        int minr=0;
		        int minc=0;
		        int maxr=arr.length-1;
		        int maxc=arr[0].length-1;
		        int te=arr.length*arr[0].length;
		        int c=0;
		        while(c<te){
		        for(int i=minr;i<=maxr && c<te;i++)
		        {
		            System.out.print(arr[i][minc]+", ");
		            c++;
		        }
		        minc++;
		        for(int i=minc;i<=maxc && c<te;i++)
		        {
		            System.out.print(arr[maxr][i]+", ");
		            c++;
		        }
		        maxr--;
		        for(int i=maxr;i>=minr && c<te;i--)
		        {
		            System.out.print(arr[i][maxc]+", ");
		            c++;
		        }
		        maxc--;
		        for(int i=maxc;i>=minc && c<te;i--)
		        {
		            System.out.print(arr[minr][i]+", ");
		            c++;
		        }
		        minr++;
		        }
		        System.out.print("END");
		    }
}

