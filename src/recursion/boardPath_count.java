package recursion;

public class boardPath_count {

	public static void main(String[] args) {
		int n=4;
		System.out.println(printPath(n,0,""));
		
	}
	private static int printPath(int destination,int start,String str) {
		if(start==destination) {
//			System.out.println(str);
			return 1;
		}
		if(start>destination) {
			return 0;
		}
		
		int a=printPath(destination,start+1,str+1);
		int b=printPath(destination,start+2,str+2);
		int c=printPath(destination,start+3,str+3);
		return a+b+c;
	}
}

