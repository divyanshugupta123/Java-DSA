package topological_sort;
import java.util.*;

public class _4_longest_cycle_in_a_graph {
	class Solution{
		public int longestCycle(int[] edges) {
			int[] in = new int[edges.length];
			for(int i = 0 ; i<edges.length; i++) {
				if(edges[i] != -1) {
					in[edges[i]]++;
				}
			}
			Queue<Integer> q = new LinkedList<>();
			for(int i = 0 ; i < in.length; i++) {
				if(in[i] == 0) {
					q.add(i);
				}
			}
			int[] visited = new int[edges.length];
			
			while(!q.isEmpty()) {
				int v = q.poll();
				visited[v] = 1;
				int nbrs = edges[v];
				if(nbrs != -1) {
					in[nbrs]--;
					if(in[nbrs] == 0) {
						q.add(nbrs);
						
					}
				}
			}
			int ans = -1;
			for(int i = 0; i<visited.length;i++) {
				if(visited[i] == 0) {
					int c = 1;
					visited[i] = 1;
					int nbrs = edges[i];
					while(nbrs != i) {
						nbrs = edges[nbrs];
					}
					ans = Math.max(ans, c);
				}
				
			}
			return ans;
		}
	}
}
