package codechef;

import java.util.Scanner;

public class Discus_Mar2022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		while(i > 0) {
			i--;
		    Integer t1 = sc.nextInt();
		    Integer t2 = sc.nextInt();
		    Integer t3 = sc.nextInt();
		    
		    sc.nextLine();
		    
		    if(t1 >= t2 && t1 >= t3) {
		    	System.out.println(t1);
		    	continue;
		    }
		    
		    if(t2 >= t1 && t2 >= t3) {
		    	System.out.println(t2);
		    	continue;
		    }
		    
		    System.out.println(t3);
		}
		
		sc.close();

	}

}
