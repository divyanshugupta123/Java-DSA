package recursion;

public class permutation_coins_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5};
		int n=10;
		print(arr,n,"");
	}
	private static void print(int[] arr,int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(n>=arr[i]) {
				print(arr, n-arr[i], ans+arr[i]);
			}
		}
	}

}
