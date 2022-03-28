package leetcode.algostudyplan1;

public class BinarySearch {
	
	public static int search(int[] nums, int target) {
		return binarySearch(0, nums.length - 1, target, nums);
    }

	private static int binarySearch(Integer start, Integer end, int target, int[] nums) {
		if(end >= start) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) { 
				return mid;
			} else if (target > nums[mid]) {
				return binarySearch(mid+1, end, target, nums);
			} else {
				return binarySearch(start, mid - 1, target, nums);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		 	int a[] = {8, 10, 22, 27, 37, 44, 49, 55, 69}; // given array  
	        int res = search(a, 22); // Store result  
	        System.out.println(res);
	}

}
