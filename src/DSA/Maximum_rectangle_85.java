package DSA;

import java.util.Stack;

public class Maximum_rectangle_85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
		int[] arr=new int[mat[0].length];
		int ans=0;
		int n=mat.length;
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<arr.length;j++) {
				if(mat[i][j]==1) {
					arr[j]=arr[j]+1;
				}
				else {
					arr[j]=0;
				}
			}
			int area=maxArea(arr);
			ans=Math.max(ans,area);
		}
		System.out.println(ans);
	}
	private static int maxArea(int[] arr) {
		Stack<Integer> st=new Stack<>();
//		int area = 0;
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h=arr[st.pop()];
				int r=i;
				if(st.isEmpty()) {
					int area=h*r;
					ans=Math.max(area, ans);
				}
				else {
					int l=st.peek();
					int area=h*(r-l-1);
					ans=Math.max(area, ans);
				}
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				int area=h*r;
				ans=Math.max(area, ans);
			}
			else {
				int l=st.peek();
				int area=h*(r-l-1);
				ans=Math.max(area, ans);
			}
		}
		return ans;
	}

}
