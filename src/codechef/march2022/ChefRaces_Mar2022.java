package codechef.march2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefRaces_Mar2022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer t = sc.nextInt();
		sc.nextLine();
		while (t > 0) {
			t--;
			Integer c1 = sc.nextInt();
			Integer c2 = sc.nextInt();
			List<Integer> l = new ArrayList<>();
			l.add(c1);l.add(c2);
			Integer a1 = sc.nextInt();
			Integer a2 = sc.nextInt();
			Integer count = 0;
			if(!l.contains(a1)) {
				count += 1;
			}
			if(!l.contains(a2)) {
				count += 1;
			}
			System.out.println(count);
		}
		sc.close();
	}
}