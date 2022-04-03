package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
		int len = s.length();
		if (len <= 1) {
			return len;
		}
		
		Map<Character, Integer> map = new HashMap<>();
		int start = 0;
		int maxLen = 0;
		
		for (int end = 0; end < len; end++) {
			char eChar = s.charAt(end);
			if (map.containsKey(eChar)) {
				start = Math.max(start, map.get(eChar) + 1);
			}
			map.put(eChar, end);
			maxLen = Math.max(maxLen, end - start + 1);
		}
		
		return maxLen;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
