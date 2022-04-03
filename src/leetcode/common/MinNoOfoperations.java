package leetcode.common;

public class MinNoOfoperations {
	
	public static int convertTime(String current, String correct) {
		String[] curr = current.split(":");
		String[] corr = correct.split(":");
		Integer cur = Integer.parseInt(curr[0]) * 60 + Integer.parseInt(curr[1]);
		Integer cor = Integer.parseInt(corr[0]) * 60 + Integer.parseInt(corr[1]);
		int count = 0;
		
		while(cur + 60 <= cor) {
			cur += 60;
			count += 1;
		}
		
		while(cur + 15 <= cor) {
			cur += 15;
			count += 1;
		}
		
		while(cur + 5 <= cor) {
			cur += 5;
			count += 1;
		}
		
		while(cur + 1 <= cor) {
			cur += 1;
			count += 1;
		}
        return count;
    }

	public static void main(String[] args) {
		System.out.println(convertTime("11:34", "11:35"));
		
	}

}
