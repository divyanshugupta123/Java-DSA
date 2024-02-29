package Graph;

import java.util.HashMap;
import java.util.HashSet;

public class _3_implement_graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;
	public _3_implement_graph(int v) {
		map = new HashMap<>();
		for(int i = 1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void addEdge(int v1 , int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public boolean containsEdge(int v1,int v2) {
		return map.get(v1).containsKey(v2);
	}
	public boolean containsVertex(int v1) {
		return map.containsKey(v1);
		
	}
	public int noofedge(int v1,int v2) {
		int ans = 0;
		for(int nighbour : map.keySet()) {
			ans+=map.get(nighbour).size();
		}
		return ans/2;
	}
	public void removeEdge(int v1,int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	
	public void removeVertex(int v1) {
		for(int i : map.get(v1).keySet()) {
			map.get(i).remove(v1);
			
		}
		map.remove(v1);
		
	}
	public void display() {
		for(int key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}
	
	public boolean hasPath(int src,int dest,HashSet<Integer> visited) {
		if(src == dest) {
			return true;
			
		}
		visited.add(src);
		for(int neighbour : map.get(src).keySet()) {
			if(!visited.contains(neighbour)) {
				boolean ans = hasPath(neighbour,dest,visited);
				if(ans) {
					return ans;
				}
			}
			
			
		}
		return false;
	}
	public void printAllPossiblePath(int src , int dest ,HashSet<Integer> visited,String ans) {
		if(src == dest) {
			System.out.println(ans+dest);
			return;
			
		}
		visited.add(src);
		for(int neighbour : map.get(src).keySet()) {
			if(!visited.contains(neighbour)) {
				printAllPossiblePath(neighbour, dest, visited, ans+src);
			}
			
			
		}
		visited.remove(src);
	}
	
}
