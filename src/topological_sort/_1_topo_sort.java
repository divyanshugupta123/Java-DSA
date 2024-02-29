package topological_sort;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class _1_topo_sort {
//	it is not a sorting algorithm it is used in Operating System
//	it is used for removing dependencies or removing deadlock
//	DAG : Directed Acyclic Graph ( having no cycle ) par hi lagaya jata hai TOPOLOGICAL sort
//	remove ignore visited self-work addNegibour
//	DAG : inDegree (kitni edges aa rahi hai ) and outDegree (kitni edges ja rahi hain)
//	topological sort is known as khan's algorithm
//	jiski indegree 0 hongi use queue m daalte rahenge or fir queue se nikalenge or uske neighbour ki indegree ko 1 se kam kr denge
//	cycle ko hum detect karenge queue m harr element aana chahiye to mtlb vo loop jitni vertex hongi utni baar chlega to loop m ek counter ko le lenge 
	
	
	HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
	
	public _1_topo_sort(int v) {
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
			
		}
	}

	public void addedge(int v1, int v2) {
		map.get(v1).put(v2, 0);
		
	}
	public int[] indegreeCal() {
		int[] arr = new int[map.size() + 1];
		for(int a : map.keySet()) {
			for(int nighbour : map.get(a).keySet()) {
				arr[nighbour]++;  
			}
		}
		return arr;
	}
	public void Topological() {
		int[] in = indegreeCal();
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1;i<in.length;i++) {
			if(in[i] == 0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int v = q.poll();
			System.out.println(v+" ");
			for(int a:map.get(v).keySet()) {
				in[a]--;
				if(in[a]==0) {
					q.add(a);
				}
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		_1_topo_sort ts = new _1_topo_sort(7);
		ts.addedge(1, 2);
		ts.addedge(1, 4);
		ts.addedge(4, 3);
		ts.addedge(3, 2);
		ts.addedge(4, 5);
		ts.addedge(5, 7);
		ts.addedge(6, 3);
		ts.addedge(6, 7);
		ts.Topological();
		
	}
	
	
}
