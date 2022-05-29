package graph;

import java.util.ArrayList;

public class DFS {
	
	public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		ArrayList<Integer> dfsList = new ArrayList<>();
		boolean[] visited = new boolean[V];
		/*
		 * for(int i = 0; i < V; i++) { if(!visited[i]) { } }
		 */
		dfs(adj, visited, dfsList, 0);
		return dfsList;
    }

	private void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> dfsList, int i) {
		visited[i] = true;
		dfsList.add(i);
		
		for(Integer j : adj.get(i)) {
			if(!visited[j]) {
				dfs(adj, visited, dfsList, j);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 