package DSA;

import java.util.Stack;

public class Maximum_Score_of_a_Good_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,4,3,7,4,5};
		int k=3;
		System.out.println(maxArea(nums,k));
	}
	private static int maxArea(int[] arr,int k) {
		Stack<Integer> st=new Stack<>();
//		int area = 0;
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h=arr[st.pop()];
				int r=i;
				if(st.isEmpty()) {
					if(r-1>=k) {
					int area=h*r;
					ans=Math.max(area, ans);
					}
				}
				else {
					int l=st.peek();
					if(l+1<=k && r-1>=k) {
					int area=h*(r-l-1);
					ans=Math.max(area, ans);
					}
				}
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				if(r-1>=k) {
				int area=h*r;
				ans=Math.max(area, ans);
				}
			}
			else {
				int l=st.peek();
				if(l+1<=k && r-1>=k) {
				int area=h*(r-l-1);
				ans=Math.max(area, ans);
				}
			}
		}
		return ans;
	}
}
