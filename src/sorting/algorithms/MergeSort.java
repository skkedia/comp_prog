package sorting.algorithms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class MergeSort {
	
	public static String removeDigit(String number, char digit) {
		int i = number.indexOf(digit, 0);
		List<BigDecimal> l = new ArrayList<>();
		while(i!=-1) {
			String s = number.substring(0, i) + number.substring(i+1 , number.length());
			if(s != "" && s != null)
				l.add(new BigDecimal(s));
			i = number.indexOf(digit, i + 1);
		}
		BigDecimal max = new BigDecimal(-1);
		for(BigDecimal j : l) {
			max = j.max(max);
		}
		return max.toString();
	}
	
	
	public static boolean backspaceCompare(String s, String t) {
		s = buildString(s);
		t = buildString(t);
		return s.equals(t);
	}
	private static String buildString(String s) {
		Stack<Character> st = new Stack<>();
		for(Character c : s.toCharArray()) {
			if(!c.equals('#')) {
				st.push(c);
			} else if (!st.isEmpty()) {
				st.pop();
			}
		}
		return String.valueOf(st);
	}
	public static void main(String[] args) {
		System.out.println(removeDigit("1231", '1'));
		Map m = new HashMap<>();
		
		
		System.out.println(backspaceCompare("ab#c", "ad#c"));
		
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