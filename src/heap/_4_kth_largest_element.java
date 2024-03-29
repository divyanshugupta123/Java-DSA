package heap;

import java.util.PriorityQueue;

public class _4_kth_largest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(sol(arr, k));
	}
	public static int sol(int[] arr,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0;i<k;i++) {
			pq.add(arr[i]);
			
		}
		for(int i = k; i< arr.length;i++) {
			if(arr[i] > pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

}
