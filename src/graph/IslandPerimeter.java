package graph;

public class IslandPerimeter {
	
	
	public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int perimeter = 0;
        perimeter = findPerimeter(0, 0, r, c, grid,perimeter);
        return perimeter;
    }

	private int findPerimeter(int i, int j, int r, int c, int[][] grid, int perimeter) {
		if(grid[i][j] == 0) {
			
		}
		
		
		
		return 0;
	}
}