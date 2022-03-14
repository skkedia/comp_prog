package codechef;

import java.util.Scanner;

public class ChfClass_Mar2022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		while(i > 0) {
			i--;
		    Integer t1 = sc.nextInt();
		    Integer a = t1 / 7;
		    
		    if(t1 % 7 == 6) {
		    	System.out.println(a + 1);
		    } else {
		    	System.out.println(a);
		    }
		    sc.nextLine();
		    
		}
		sc.close();
	}
}
