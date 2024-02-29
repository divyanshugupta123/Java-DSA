package recursion;

public class queen_combination {

	public static void main(String[] args) {
		int n=4;
		int q=2;
		boolean[] board=new boolean[4];
		combination(board, q, 0, "",0);
	}
	private static void combination(boolean[] boardd,int q,int qpsf,String ans,int index) {
		if(qpsf==q) {
			System.out.println(ans);
			return;
		}
		for(int i=index;i<boardd.length;i++) {
			if(boardd[i]==false) {
				boardd[i]=true;
				
				combination(boardd, q, qpsf+1, ans+"b"+i+"q"+qpsf,i+1);
				
				boardd[i]=false;
			}
		}
	}
}