package com.data;

public class Ispalindrome {

	public static void isPolindrome(int num) {

		int r = 0;
		int sum = 0;
		int t;
		t = num;

		while (num > 0) {
			r = num % 10; // to get the reminder

			sum = (sum * 10) + r;
			num = num / 10;

		}
		if (t== sum) {
			System.out.println("polindrome number");
		} else {
			System.out.println("not polindrome number");
		}

	}
	
	public static void main(String[] args) {
		isPolindrome(121);
		
		isPolindrome(6768);
	}

}
