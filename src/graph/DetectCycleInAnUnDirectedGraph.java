package graph;

import java.util.ArrayList;

public class DetectCycleInAnUnDirectedGraph {
	
	public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[V];
		boolean[] resC = new boolean[V];
		
		for(int i = 0; i < V; i++) {
			if(!visited[i]) {
				if(dfs(i, adj, visited, resC)) {
					return true;
				}
			}
		}
		return false;
    }

	private boolean dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] resC) {
		visited[i] = true;
		resC[i] = true;
		
		for(Integer ne : adj.get(i)) {
			if(!visited[ne]) {
				if(dfs(ne, adj, visited, resC)) {
					return true;
				}
			} else if(resC[ne]) {
				return true;
			}
		}
		resC[i] = false;
		return false;
	}
}