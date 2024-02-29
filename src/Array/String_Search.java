package Array;
import java.util.*;
public class String_Search {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter the character which you want to search");
		char chr=sc.next().charAt(0);
		System.out.println(search(name,chr));
	}
	static int search(String a,char ch) {
		for(int i=0;i<a.length();i++) {
			if(ch==a.charAt(i))
			{
				return i;
			}
		}
		return -1;
	}
}
