package leetcode.string;

public class ReverseASentence3 {
	
	public static String reverseWords(String s) {
		String a = "";
		String[] arr = s.split(" ");
		for(String ar : arr) {
			a += String.valueOf(reverseString(ar.toCharArray()));
			a += " ";
		}
		
        return a.substring(0, a.length() - 1);
    }
	
	public static char[] reverseString(char[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
        	char temp = nums[i];
        	nums[i] = nums[j];
        	nums[j] = temp;
        	i++;
        	j--;
        }
        return nums;
    }

	public static void main(String[] args) {
		
		String a = reverseWords("Let's take LeetCode contest");
		System.out.println(a);
	}

}
