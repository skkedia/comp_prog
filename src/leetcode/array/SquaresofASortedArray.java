package leetcode.array;

import java.util.Arrays;

public class SquaresofASortedArray {
	
	public static int[] sortedSquares(int[] nums) {
		nums = getSquareArray(nums);
		
		return sortedArray(nums);
    }

	private static int[] sortedArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length - i - 1; j++) {
				if(nums[j] > nums[j + 1]) {
					int temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}

	private static int[] getSquareArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = new int[6];
		//[-4,-1,0,3,10]
		nums[0] = 100;
		nums[1] = -1;
		nums[2] = 0;
		nums[3] = 3;
		nums[4] = 10;
		nums[5] = -4;
		sortedSquares(nums);
		System.out.println(Arrays.toString(nums));
		
	}

}
