package leetcode.common;

public class Power {
	
	public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }

	public static void main(String[] args) {
		System.out.println(myPow(23.0d, -5));
	}
}