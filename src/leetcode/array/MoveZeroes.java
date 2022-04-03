package leetcode.array;

import java.util.Arrays;

public class MoveZeroes {
	
	public static void moveZeroes(int[] nums) {
        int s = nums.length;
        int[] n = new int[s];
        int min = 0;int max = s - 1;
        for(int i = 0; i < s; i++) {
        	if(nums[i] == 0) {
        		n[max] = nums[i];
        		max--;
        	} else {
        		n[min] = nums[i];
        		min++;
        	}
        }
        
        for(int i = 0; i < s; i++) {
        	nums[i] = n[i];
        }
        
    }

	public static void main(String[] args) {
		int[] nums = new int[5];
		//[-4,-1,0,3,10]
		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 0;
		nums[3] = 3;
		nums[4] = 12;
		//nums[5] = 6;
		//nums[6] = 7;
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

}
