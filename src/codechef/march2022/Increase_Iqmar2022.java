package codechef.march2022;

import java.util.Scanner;

public class Increase_Iqmar2022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer iq = sc.nextInt();
		if(iq + 7 > 170) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}