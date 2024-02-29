package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _6_graphDFS {
	HashMap<Integer, HashMap<Integer, Integer>> map;
	public _6_graphDFS(int v) {
		map = new HashMap<>();
		for(int i = 1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void addEdge(int v1 , int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public boolean BFS(int src,int des) {
		Stack<Integer> q = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		
		q.add(src);
		while(!q.isEmpty()) {
			
//			1) : remove
			int rv = q.pop();
			
//			2) : if already visited then ignore
			if(visited.contains(rv)) {
				continue;
			}
			
//			3) : Marked visited
			visited.add(rv);
			
//			4) : self work
			if(rv == des) {
				return true;
			}
			
//			5) : Add Neighbors
			for(int nighbours : map.get(rv).keySet()) {
				if(!visited.contains(nighbours)) {
					q.add(nighbours);
				}
			}
			
		}
		return false;
	}
	
	
	public void DFT(int src,int des) {
		Stack<Integer> q = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		
		q.add(src);
		for(int i : map.keySet()) {
			while(!q.isEmpty()) {
				
//				1) : remove
				int rv = q.pop();
				
//				2) : if already visited then ignore
				if(visited.contains(rv)) {
					continue;
				}
				
//				3) : Marked visited
				visited.add(rv);
				
//				4) : self work
				
				System.out.println(rv+" ");
				
//				5) : Add Neighbors
				for(int nighbours : map.get(rv).keySet()) {
					if(!visited.contains(nighbours)) {
						q.add(nighbours);
					}
				}
				
			}
		}
		}
		
	
	
}
