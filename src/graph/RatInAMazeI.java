package graph;

import java.util.ArrayList;

public class RatInAMazeI {

	public static ArrayList<String> findPath(int[][] m, int n) {
		ArrayList<String> res = new ArrayList<>();
		int[][] solMaze = new int[n][n];
		int[] di = {1, 0, 0, -1};
		int[] dj = {0, -1, 1, 0};
		if(m[0][0] == 1) {
			solve(0, 0, m, n, res, "", solMaze, di, dj);
		}

		return res;
	}
	public static void solve(int i, int j, int[][] m, int n, ArrayList<String> res, String path, int[][] solMaze, int[] di, int[] dj) {
		if(i == n-1 && j == n-1){
			solMaze[i][j] = 1;
			res.add(path);
			solMaze[i][j] = 0;
			return;
		}

		String dir = "DLRU";

		for(int index = 0; index < dir.length(); ++index) {
			int nexti = i + di[index];
			int nextj = j + dj[index];

			if(nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && solMaze[nexti][nextj] == 0 && m[nexti][nextj] == 1) {
				solMaze[i][j] = 1;
				solve(nexti, nextj, m, n, res, path + dir.charAt(index), solMaze, di, dj);
				solMaze[i][j] = 0;
			}
		}
	}

}
