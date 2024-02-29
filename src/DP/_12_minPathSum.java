package DP;

public class _12_minPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(path_sum(arr, 0, 0));
	}
	public static int path_sum(int[][] arr,int cr,int cc) {
		if(cr == arr.length-1 && cc == arr[0].length-1) {
			return arr[cr][cc];
			
		}
		if(cr>=arr.length || cc>= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		int h = path_sum(arr, cr, cc+1);
		int v = path_sum(arr, cr+1, cc);
		return Math.min(h, v)+arr[cr][cc];
		
	}
	
	public static int path_sum(int[][] arr, int cr, int cc, Integer[][] memo) {
	    if (cr == arr.length - 1 && cc == arr[0].length - 1) {
	        return arr[cr][cc];
	    }
	    
	    if (cr >= arr.length || cc >= arr[0].length) {
	        return Integer.MAX_VALUE;
	    }
	    
	    if (memo[cr][cc] != null) {
	        return memo[cr][cc];
	    }

	    int h = path_sum(arr, cr, cc + 1, memo);
	    int v = path_sum(arr, cr + 1, cc, memo);

	    memo[cr][cc] = Math.min(h, v) + arr[cr][cc];
	    return memo[cr][cc];
	}

	public static int path_sum(int[][] arr) {
	    int numRows = arr.length;
	    int numCols = arr[0].length;
	    Integer[][] memo = new Integer[numRows][numCols];

	    return path_sum(arr, 0, 0, memo);
	}

	

}
