package Graph;

import java.util.*;
public class _7_Graph_valid_tree {
	class Solution{
		HashMap<Integer,List<Integer>> map = new HashMap<>();
		public boolean validTree(int n,int[][] edges) {
			
			for (int i = 0; i < n ; i++) {
				map.put(i, new ArrayList<>());
				
			}
			for (int i = 0; i < edges.length; i++) {
				int a = edges[i][0];
				int b = edges[i][1];
				map.get(a).add(b);
				map.get(b).add(a);
			}
//			return DFT(n,) 
			return false;
			
		}
		public boolean DFT(int src,int des) {
			Stack<Integer> q = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			
			q.add(src);
			int c = 0;
			for(int i : map.keySet()) {
				while(!q.isEmpty()) {
					
//					1) : remove
					int rv = q.pop();
					
//					2) : if already visited then ignore
					if(visited.contains(rv)) {
						continue;
					}
					
//					3) : Marked visited
					visited.add(rv);
					
//					4) : self work
					
					System.out.println(rv+" ");
					
//					5) : Add Neighbors
					for(int nighbours : map.get(rv)) {
						if(!visited.contains(nighbours)) {
							q.add(nighbours);
						}
					}
					
				}
			}
			return c==1;
			}
	}
}
