package hackerblock;

import java.util.Scanner;

public class book_allocation_problem {

	
//	link of the question is https://hack.codingblocks.com/app/contests/2883/1365/problem
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(); // number of books
			int m = sc.nextInt(); // number of students
			int pages[] = new int[n];
			for(int i=0;i<pages.length;i++) {
				pages[i] = sc.nextInt();
				
			}
			System.out.println(minNumberPages(pages, m));
		}
		
		
	}
	private static int minNumberPages(int[] page,int nos) {
		int high = 0;
		for(int i=0;i<page.length;i++) {
			high+=page[i];
		}
		int ans = 0;
		int low = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(isitPossible(page,nos,mid)) {
				ans = mid;
				high = mid - 1;
				
			}
			else {
				low = mid + 1;
			}
		}
		return ans;
	}
	private static boolean isitPossible(int[] page, int nos, int mid) {
		// TODO Auto-generated method stub
		int student = 1;
		int readpage = 0;
		int i = 0;
		while(i<page.length) {
			if(readpage+page[i]<=mid) {
				readpage += page[i];
				i++;
			}
			else {
				student++;
				readpage = 0;
				
			}
			if(student > nos) {
				return false;
			}
		}
		return true;
	}

}
