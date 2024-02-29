package heap;

import java.util.ArrayList;

public class _1_heap {
	
	
	private ArrayList<Integer> list;
	
	public _1_heap() {
		list = new ArrayList<>();
		
	}
	public void add(int item) {
		list.add(item);
		upheapify(list.size()-1);
	}
	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci-1)/2;
		if(list.get(pi)>list.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}
	}
	public void swap(int pi,int ci) {
		
		int ith = list.get(pi);
		int jth = list.get(ci);
		list.set(pi, jth);
		list.set(ci, ith);  
//		int temp = list.get(pi);
//		list.set(pi, list.get(ci));
//		list.set(ci, temp);
		
	}
	public int get() {
		return list.get(0);
	}
	public int remove() {
//		we swap the first element with the last element to take the complexity to log n if we don't do like the then we have to remove the element from the 0th index and shifting each element towards left it take complexity O(n)
		
		int rv = list.get(0);
		swap(0,list.size()-1);
		list.remove(list.size()-1);
		downheapify(0);
		return rv;
	}
	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi +1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if(lci < list.size() && list.get(lci)<list.get(mini)) {
			mini = lci;
		}
		if(rci < list.size()&&list.get(rci)<list.get(mini)) {
			mini = rci;
		}
		if(mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}
		
	}
	public void display() {
		System.out.println(list);
	}
}
