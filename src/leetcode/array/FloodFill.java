package leetcode.array;

import java.util.Arrays;

public class FloodFill {
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int orgColor = image[sr][sc];
		if(orgColor != newColor)
		fill(image, sr, sc, newColor, orgColor);
		return image;
    }

	private static void fill(int[][] image, int sr, int sc, int newColor, int orgColor) {
		if(image[sr][sc] == orgColor) {
			image[sr][sc] = newColor;
			if(sr - 1 >= 0) {
				fill(image, sr - 1, sc, newColor, orgColor);
			}
			if(sr + 1 < image.length) {
				fill(image, sr + 1, sc, newColor, orgColor);
			}
			if(sc - 1 >= 0) {
				fill(image, sr, sc - 1, newColor, orgColor);
			}
			if(sc + 1 < image[0].length) {
				fill(image, sr, sc + 1, newColor, orgColor);
			}
		}
	}

	public static void main(String[] args) {
		int[][] image = new int[][]{
			new int[] {1, 1, 1},
			new int[] {1, 1, 0},
			new int[] {1, 0, 1},
		};
		
		floodFill(image, 1, 1, 2);
		System.out.println(Arrays.toString(image));
		
	}

}
