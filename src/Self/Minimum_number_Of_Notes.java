package Self;

import java.util.Scanner;

public class Minimum_number_Of_Notes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		int tth=amount/2000;
		amount=amount%2000;
		int fh=amount/500;
		amount=amount%500;
		int th=amount/200;
		amount=amount%200;
		int hu=amount/100;
		amount%=100;
		System.out.println("Total Number of Notes Are : "+(tth+fh+th+hu));
		System.out.println("Number of Two Thousand Notes : "+tth+"\nNumber of Five Hundred Notes : "+fh+"\nNumber of Two Hundred Notes : "+th+"\nNumber of Hundred Rs Notes : "+hu);
	}
}
