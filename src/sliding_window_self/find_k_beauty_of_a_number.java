package sliding_window_self;

public class find_k_beauty_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 240;
		int k=2;
		System.out.println(countBeautyNumber(num, k));
	}
	private static int countBeautyNumber(int num,int k) {
		int ans = 0;
		char[] chars = String.valueOf(num).toCharArray();; 
		for(int i=0;i<k;i++) {
			String str = "";
			str=str+chars[i];
			int n=Integer.parseInt(str); 
			if(num%n==0) {
				ans++;
			}
		}
		for(int i=k;i<chars.length;i++) {
			String str = "";
			str = str+chars[i];
			str= str.substring(1);
			int n=Integer.parseInt(str); 
			if(num%n==0) {
				ans++;
			}
			
		}
		return ans;
		
		
	}

}
