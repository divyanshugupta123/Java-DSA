package DP;

public class _16_optimal_game_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,8,4};
		System.out.println(optimal_game(arr, 0, arr.length-1));
		
		
	}
	public static int optimal_game(int[] arr,int i ,int j) {
		
		if(i>j) {
			return 0;
			
		}
		int first = arr[i] + Math.min(optimal_game(arr,i+2,j),optimal_game(arr, i+1, j-1));
		int last  = arr[j] + Math.min(optimal_game(arr, i+1, j-1), optimal_game(arr, i, j-2));
		return Math.max(first, last);
		
	}

}
