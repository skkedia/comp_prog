package graph;

public class NumberOfIsland {
	
	public void dfs(char[][] grid, int r, int c) {
		if (grid[r][c] == '2')
			return;

		grid[r][c] = '2';

		// left direction
		if (c != 0)
			if (grid[r][c - 1] == '1')
				dfs(grid, r, c - 1);

		// top direction
		if (r != 0)
			if (grid[r - 1][c] == '1')
				dfs(grid, r - 1, c);

		// right direction
		if (c != grid[0].length - 1)
			if (grid[r][c + 1] == '1')
				dfs(grid, r, c + 1);

		// down direction
		if (r != grid.length - 1)
			if (grid[r + 1][c] == '1')
				dfs(grid, r + 1, c);
		
		if (r != 0 && c != 0)
			if (grid[r - 1][c - 1] == '1')
				dfs(grid, r - 1, c - 1);
		
		if (r != 0 && c != grid[0].length - 1)
			if (grid[r - 1][c + 1] == '1')
				dfs(grid, r - 1, c + 1);
		
		if (r != grid.length - 1 && c != grid[0].length - 1)
			if (grid[r + 1][c + 1] == '1')
				dfs(grid, r + 1, c + 1);
		
		if (r != grid.length - 1 && c != 0)
			if (grid[r + 1][c - 1] == '1')
				dfs(grid, r + 1, c - 1);
		
		//["1","1","0","0","0"]
		//["1","1","0","0","0"]
		//["0","0","1","0","0"]
		//["0","0","0","1","1"]
	}

	public int numIslands(char[][] grid) {
		int m = grid.length, n = grid[0].length;
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] != '1')
					continue;
				dfs(grid, i, j);
				count++;
			}
		}
		return count;
	}
}