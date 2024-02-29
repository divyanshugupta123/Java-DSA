package practice;

import java.util.Scanner;

public class tryandcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			if (age < 0) {
				throw new Exception("Age cannot be negative");
			}
			else {
				System.out.println("Age is "+age);
			}
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();  // this will give you the line number where the error comes
		}
		finally {
			System.out.println("run always whether error occurs or not");
		}
	}

}
