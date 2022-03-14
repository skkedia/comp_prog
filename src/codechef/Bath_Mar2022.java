package codechef;

import java.util.Scanner;

public class Bath_Mar2022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		while(i > 0) {
			i--;
		    Integer t1 = sc.nextInt();
		    Integer t2 = sc.nextInt();
		    
		    sc.nextLine();
		    
		    t2 = t2 * 2;
		    
		    t2 = t1 / t2;
		    
		    System.out.println(t2);
		    
		    
		}
		
		sc.close();

	}

}
