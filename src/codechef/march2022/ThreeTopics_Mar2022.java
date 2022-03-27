package codechef.march2022;

import java.util.Scanner;

public class ThreeTopics_Mar2022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer t1 = sc.nextInt();
		Integer t2 = sc.nextInt();
		Integer t3 = sc.nextInt();
		Integer x = sc.nextInt();
		if(t1 == x || t2 == x || t3 == x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
		
	}

}
