package recursion;

public class queen_permutations {

	public static void main(String[] args) {
		int n=4;
		int q=2;
		boolean[] board=new boolean[4];
		permuattaions(board, q, 0, "");
	}
	private static void permuattaions(boolean[] boardd,int q,int qpsf,String ans) {
		if(qpsf==q) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<boardd.length;i++) {
			if(boardd[i]==false) {
				boardd[i]=true;
				permuattaions(boardd, q, qpsf+1, ans+"b"+i+"q"+qpsf);
				boardd[i]=false;
			}
		}
	}
}
