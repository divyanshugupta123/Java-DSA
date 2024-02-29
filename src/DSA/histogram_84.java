package DSA;

import java.util.Stack;

public class histogram_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,4,6,1,7};
		System.out.println(maxArea(arr));
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
