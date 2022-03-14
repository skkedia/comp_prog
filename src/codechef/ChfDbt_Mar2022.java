package codechef;

import java.util.Scanner;

public class ChfDbt_Mar2022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		while(i > 0) {
			i--;
			Integer noOfQuestion = sc.nextInt();
			noOfQuestion = noOfQuestion + 1;
			
			System.out.println(noOfQuestion>>1);
			
			
		}
		sc.close();
	}

}
