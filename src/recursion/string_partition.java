package recursion;

import java.util.ArrayList;
import java.util.List;

public class string_partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="nitin";
//		String ans="";
		List<String> ll=new ArrayList<>();
		List<List<String>> ans=new ArrayList<>();
		
		printPartition(ques, ll,ans);
		System.out.println(ans);
	}
	private static void printPartition(String que,List<String> ll,List<List<String>> ans) {
		if(que.length()==0) {
//			System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=1;i<=que.length();i++) {
			String part=que.substring(0,i);
			if(isPalindrome(part)) {
				ll.add(part);
				printPartition(que.substring(i), ll,ans);
				ll.remove(ll.size()-1);
			}
		}
	}
	private static boolean isPalindrome(String part) {
		// TODO Auto-generated method stub
		int i=0,j=part.length()-1;
		while(i<j) {
			if(part.charAt(i)!=part.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
