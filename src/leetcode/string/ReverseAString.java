package leetcode.string;

import java.util.Arrays;

public class ReverseAString {
	
	public static void reverseString(char[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
        	char temp = nums[i];
        	nums[i] = nums[j];
        	nums[j] = temp;
        	i++;
        	j--;
        }
    }

	public static void main(String[] args) {
		char[] nums = new char[5];
		nums[0] = 'h';
		nums[1] = 'e';
		nums[2] = 'l';
		nums[3] = 'l';
		nums[4] = 'o';
		//nums[5] = 'o';
		reverseString(nums);
		System.out.println(Arrays.toString(nums));
	}
}