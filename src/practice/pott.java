package practice;

public class pott {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
		int k = 3;
		
	}
	private static void kWeakestRows(int[][] mat, int k) {
		
		for(int i = 0;i<mat.length;i++) {
			int c = 0;
			int[] arr = new int[mat.length];
			for(int j = 0 ; j<mat[0].length;j++) {
				if(mat[i][j] == 1) {
					c++;
				}
				
			}
			arr[i] = c;
		}
	}

}
