package graph;

import java.util.ArrayList;

public class DetectCycleInUndirectedGraph {
	
	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[V];
		/*
		 * for(int i = 0; i < adj.size(); i++) { if(!visited[i]) { } }
		 */
		if(dfs(adj, 0, visited, -1))
			return true;
        return false;
    }

	private boolean dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, int parent) {
		visited[i] = true;
		for(Integer a : adj.get(i)) {
			if(!visited[a]) {
				if(dfs(adj, a, visited, i)) {
					return true;
				}
			} else if(parent != a) {
				return true;
			}
		}
		return false;
	}
}