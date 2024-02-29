package Graph;


// array = [4,2,3,5,1]
// given array contains 4 matrices 1 = 4 * 2 , 2 = 2 * 3 , 3 = 3 * 5 , 4 = 5 * 1


// matrix chain multiplication


public class _2_mcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,3,5,1};
		System.out.println(mcm(arr,0,arr.length-1));
	}
	private static int mcm(int[] arr,int i,int j) {
		if(i + 1 == j) {
			return 0;
			
		}
		int ans = Integer.MAX_VALUE;
		for(int k = i+1;k<j;k++) {
			int fs = mcm(arr,i,k);
			int ss = mcm(arr,k,j);
			int self = arr[i] * arr[j] * arr[k];
			ans = Math.min(ans , fs + ss + self);
			
		}
		return  ans;
	}

	
	
	
}
