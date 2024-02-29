package sliding_Window;
import java.util.*;
public class Kartik_Bhaiya_And_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
		int aflip=perfectness_max_len(str, k, 'a');
		int bflip=perfectness_max_len(str, k, 'b');
		System.out.println(Math.max(aflip,bflip));
	}
	private static int perfectness_max_len(String str, int k,char ch) {
		int si=0;
		int ei=0;
		int ans=0;
		int flip=0;
		while(ei<str.length()) {
			if(str.charAt(ei)==ch) {
				flip++;
			}
			while(flip>k) {
				if(str.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
