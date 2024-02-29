package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class _3_heap_demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();	// MIN HEAP
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());	// MAX HEAP
		pq.add(3);
		pq.add(2);
		pq.add(3);
		pq.add(1);
		pq.add(2);
		pq.add(4);
		pq.add(5);
		pq.add(5);
		pq.add(6);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
	}
}
