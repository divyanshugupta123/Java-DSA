package spanning_tree;

import java.util.*;

public class krushkals_algorithem {
	HashMap<Integer, HashMap<Integer, Integer>> map;
	public krushkals_algorithem(int v) {
		map = new HashMap<>();
		for(int i = 1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void addEdge(int v1 , int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	class EdgePair{
		int e1;
		int e2;
		int cost;
		public String toString() {
			return this.e1 + " " + this.e2 + " @ " + this.cost;
			
		}
		public EdgePair(int e1,int e2,int cost){
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
			
		}
	}
	public List<EdgePair > getallEdge(){
		List<EdgePair> ll = new ArrayList<>();
		
		for(int e1 : map.keySet()) {
			for(int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1,e2, cost));
				
			}
		}
		return ll;
	}
	public void krushal() {
		List<EdgePair> ll = getallEdge();
		Collections.sort(ll,new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
			
		});
		DSU dsu = new DSU();
		for(int v: map.keySet()) {
			dsu.create(v);
			
		}
		for(EdgePair e :ll) {
			int re1 = dsu.find(e.e1);
			int re2 = dsu.find(e.e2);
			if(re1 == re2) {
				
			}else {
				dsu.union(e.e1, e.e2);
				System.out.println(e);
			}
		}
		
	}
	public static void main(String[] args) {
		krushkals_algorithem g = new krushkals_algorithem(7);
		g.addEdge(1, 4, 6);
		
		
		
	}
}
