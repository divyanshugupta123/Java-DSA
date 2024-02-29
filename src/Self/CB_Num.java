package Self;

import java.util.Scanner;

public class CB_Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		lenSubString(str);
		sc.close();
	}

	public static void lenSubString(String str) {
		int c=0;
		boolean[] visited=new boolean[str.length()];
		for(int len=1;len<=str.length();len++) {
			for(int j=len;j<=str.length();j++) {
				int i=j-len;
				String s=str.substring(i,j);
				long num=Long.parseLong(s);
				if(isCbnumber(num) && isVisited(visited, i, j-1)) {
					c++;
					for(int k=i;k<=j-1;k++) {
						visited[k]=true;
					}
				}
				
			}
		}
		System.out.println(c);
	}
	public static boolean isVisited(boolean[] visited,int i,int j) {
		for(int k=i;k<=j;k++) {
			if(visited[k]==true)
				return false;
		
		}
		return true;
	}
	public static boolean isCbnumber(long num) {
		if(num==0 || num==1) {
			return false;
		}
		int[] arr= {2,3,5,7,11,13,17,19,23,29 };
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
