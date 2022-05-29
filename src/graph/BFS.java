package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		ArrayList<Integer> bfsList = new ArrayList<>();
		boolean[] visited = new boolean[V];
		for(int i = 0; i < V; i++) {
			if(!visited[i]) {
				bfs(adj, visited, bfsList, i);
			}
		}
		return bfsList;
    }
	
	public static String reverseWord(String str)
    {
        int i = 0;
        int j = str.length() - 1;
        char[] arr = new char[j + 1];
        
        while(i < j) {
        	char a = str.charAt(i);
        	char b = str.charAt(j);
        	arr[i] = b;
        	arr[j] = a;
        	i++;
        	j--;
        }
        String rev = "";
        for(char a : arr) {
            rev = rev + a;
        }    
        return rev;
    }

	private void bfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> bfsList, Integer a) {
		java.util.LinkedList<Integer> queue = new java.util.LinkedList<>();
		
		Queue <String> q = new LinkedList<>();
		q.add("a");
		q.poll();
		q.remove();
		q.offer("");
		q.peek();
		
		
		
		visited[a] = true;
		queue.add(a);
		int j = 0;
		while(!queue.isEmpty()) {
			Integer cur = queue.remove();
			bfsList.add(cur);
			for(int i = 0; i < adj.get(cur).size(); i++) {
				j = adj.get(cur).get(i);
				if(!visited[j]) {
					visited[j] = true;
					queue.add(j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
