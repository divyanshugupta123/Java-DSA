package recursion;

public class boardPath {

	public static void main(String[] args) {
		int n=3;
		printPath(n,0,"");
		
	}
	private static void printPath(int destination,int start,String str) {
		if(start==destination) {
			System.out.println(str);
			return;
		}
		if(start>destination) {
			return;
		}
		printPath(destination,start+1,str+1);
		printPath(destination,start+2,str+2);
		printPath(destination,start+3,str+3);
	}
}
