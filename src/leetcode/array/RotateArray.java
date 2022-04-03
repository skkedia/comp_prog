/**
 * 
 */
package leetcode.array;

import java.util.Arrays;

/**
 * @author lenovo
 *
 */
public class RotateArray {
	
	public static void rotate(int[] nums, int k) {
		if(k == 0) {
            return;
        }
        int s = nums.length;
        while(k > s) {
        	k = k - s;
        }
        int[] n = new int[s];
        for(int i = 0; i < s; i++) {
        	if(i + k < s) {
        		n[i + k] = nums[i];
        	} else {
        		int t = (i + k) - s;
        		n[t] = nums[i];
        	}
        }
        for(int i = 0; i < s; i++) {
        	nums[i] = n[i];
        }
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[4];
		//[-4,-1,0,3,10]
		nums[0] = -1;
		nums[1] = -100;
		nums[2] = 3;
		nums[3] = 99;
		//nums[4] = 5;
		//nums[5] = 6;
		//nums[6] = 7;
		rotate(nums, 2);
		System.out.println(Arrays.toString(nums));
		
	}

}
