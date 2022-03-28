package leetcode.algostudyplan1;

public class SearchInsertPosition {

	public static int searchInsert(int[] A, int target) {
		return binarySearch(0, A.length, target, A);
	}

	private static int binarySearch(Integer start, Integer end, int target, int[] A) {
		int low = 0;
		int high = A.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (target < A[mid]) 
				high = mid - 1;
			else if (target > A[mid]) 
				low = mid + 1;
			else 
				return mid;
		}
		return low;
	}

	public static void main(String[] args) {
		int a[] = {8, 10, 22, 27, 37, 44, 49, 55, 69}; // given array  
		int res = searchInsert(a, 0); // Store result  
		System.out.println(res);
	}

}
