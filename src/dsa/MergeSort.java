package dsa;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] nums = new int[10];
		nums[0] = 1000;
		nums[1] = 1;
		nums[2] = 5;
		nums[3] = 434;
		nums[4] = 678;
		nums[5] = 876;
		nums[6] = 432;
		nums[7] = 12;
		nums[8] = -1;
		nums[9] = 34;
		doMergeSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void doMergeSort(int[] nums) {
		div(nums, 0, nums.length - 1);
	}

	private static void div(int[] nums, int start, int end) {
		if(end > start) {
			int mid = start + (end - start) / 2;
			div(nums, start, mid);
			div(nums, mid + 1, end);
			merge(nums, start, mid, end);
		}
	}

	private static void merge(int[] nums, int start, int mid, int end) {
	    int n1 = mid - start + 1;    
	    int n2 = end - mid;    
	      
	    int[] leftArray = new int[n1]; 
	    int[] rightArray = new int[n2]; 
	      
	    /* copy data to temp arrays */  
	    for (int i = 0; i < n1; i++)
	    	leftArray[i] = nums[start + i];
        for (int j = 0; j < n2; j++)
        	rightArray[j] = nums[mid + 1 + j];
	      
	    int i = 0;
	    int j = 0;
	    int k = start;
	      
	    while (i < n1 && j < n2) {    
	        if(leftArray[i] <= rightArray[j]) {    
	            nums[k] = leftArray[i];    
	            i++;    
	        } else {    
	            nums[k] = rightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i < n1) {    
	        nums[k] = leftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j < n2) {    
	        nums[k] = rightArray[j];    
	        j++;    
	        k++;    
	    }    
	}
}