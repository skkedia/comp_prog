package codechef;

import java.util.Scanner;

public class Genius_Mar2022 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		while(i > 0) {
			i--;
		    Integer noOfQuestion = sc.nextInt();
		    Integer score = sc.nextInt();
		    
		    if(score > noOfQuestion * 3) {
		    	System.out.println("NO");
		    	continue;
		    }
		    
		    Integer correct = 0;
		    Integer incorrect = 0;
		    if(score != 0 && score %  3 == 0) {
		    	correct = correct + (score / 3);
		    } else if (score % 3 == 1) {
		    	correct = correct + (score / 3) + 1;
		    	incorrect = incorrect + 2;
		    } else if (score % 3 == 2) {
		    	correct = correct + (score / 3) + 1;
		    	incorrect = incorrect + 1;
		    }
		    
		    if(correct + incorrect <= noOfQuestion) {
		    	System.out.println("YES");
		    	System.out.println(correct + " " + incorrect + " " + (noOfQuestion - correct - incorrect));
		    } else {
		    	System.out.println("NO");
		    }
		    
		    sc.nextLine();
		}
		sc.close();
	}

}
