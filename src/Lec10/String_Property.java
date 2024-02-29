package Lec10;

public class String_Property {

	public static void main(String[] args) {
		String s="Divyanshu Gupta";
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.substring(2,5));// index 5 is excluded it mean it only print 2 to 4
//		how to compare 2 string in lexiographically 
		String s1="komal";
		String s2="kunal";
		System.out.println(s1.compareTo(s2));
				
	}
	private static int compareTo(String s1 , String s2) {
		int i=0,j=0;
		while(i<s1.length()&& j<s2.length()) {
			if(s1.charAt(i)!=s2.charAt(j)) {
				return s1.charAt(i)-s2.charAt(j);
			}
			i++;
			j++;
		}
		return s1.length()-s2.length();
	}

}
