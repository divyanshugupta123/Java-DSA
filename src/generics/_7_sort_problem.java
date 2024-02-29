package generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _7_sort_problem {
	 String name;
	 int salary;
	 public _7_sort_problem(String name,int salary) {
		 this.name = name;
		 this.salary = salary;
		  
	 }
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		_7_sort_problem[] arr = new _7_sort_problem[n];
		for(int i = 0; i<arr.length;i++) {
			String naam = sc.next();
			int sal = sc.nextInt();
			arr[i] = new _7_sort_problem(naam, sal);
			
		}
		Arrays.sort(arr,new Comparator<_7_sort_problem>() {

			@Override
			public int compare(_7_sort_problem o1, _7_sort_problem o2) {
				// TODO Auto-generated method stub
				if(o1.salary == o2.salary) {
					return o1.name.compareTo(o2.name);
					
				}
				else {
					return o2.salary - o1.salary;
				}
			}
		});
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].salary>x) {
				System.out.println(arr[i].name+arr[i].salary);
				
			}
		}
	}
	 
}

