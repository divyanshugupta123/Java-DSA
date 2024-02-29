package bitmasking;

public class Avengers_End_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prime = {2,3,5};
		int n = 1000;
		System.out.println(printUniqueCount(prime, n));
	}
	public static int printUniqueCount(int[] arr,int n) {
		int len = arr.length;
		int ans =0;
		for(int i = 1;i<(1<<len);i++) {
			if((FastCount(i)&1)!=0) {
				ans+=InterSection(arr,n,i);
				
			}
			else {
				ans-= InterSection(arr,n,i);
			}
		}
		return ans;
	}
	private static int InterSection(int[] arr, int n, int i) {
		// TODO Auto-generated method stub
		int p =1;
		int pos = 0;
		while(i>0) {
			if((i&1)!=0) {
				p*=arr[pos];
			}
			pos++;
			i>>= 1;
		
		
		}
		return n/p;
	}
	public static int FastCount(int n) {
		int count = 0;
		while (n > 0) {
			n = (n & (n - 1));
			count++;
		}
		return count;
	}

}
