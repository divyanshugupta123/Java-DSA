package spanning_tree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;








public class Prims_algorithem {
	HashMap<Integer, HashMap<Integer, Integer>> map;
	public Prims_algorithem(int v) {
		map = new HashMap<>();
		for(int i = 1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void addEdge(int v1 , int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	class PrimsPair{
		int e1,e2,cost;
		public PrimsPair(int e1,int e2,int cost) {
			this.e1=e1;
			this.e2 = e2;
			this.cost = cost;
			
		}
		public String toString() {
			return this.e1 + " " + this.e2 + " @ " + this.cost;
			
		}
	}
	public <T> void Prims() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o2.cost-o1.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		
		pq.add(new PrimsPair(3,3,0));
		while(!pq.isEmpty()) {
			PrimsPair pr = pq.poll();
			if(visited.contains(pr.e1)) {
				continue;
			}
			visited.add(pr.e1);
			System.out.println(pr);
			for(int n:map.get(pr.e1).keySet()) {
				if(visited.contains(n)) {
					int cost = map.get(pr.e1).get(n);
					pq.add(new PrimsPair(n,pr.e1,cost));
				}
			}
		}
	}

}
