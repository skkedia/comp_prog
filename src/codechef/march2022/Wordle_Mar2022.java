package codechef.march2022;

import java.util.Scanner;

public class Wordle_Mar2022 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		while(i > 0) {
			i--;
		    String guess = sc.next();
		    sc.nextLine();
		    String actual = sc.next();
		    sc.nextLine();

		    String m = "";
		    for(int ii = 0 ; ii < guess.length(); ii++) {
		    	if(guess.charAt(ii) == actual.charAt(ii)) {
		    		m += "G";
		    		continue;
		    	}
		    	m += "B";
		    }
		    System.out.println(m);
		    
		}
		sc.close();
	}

}
