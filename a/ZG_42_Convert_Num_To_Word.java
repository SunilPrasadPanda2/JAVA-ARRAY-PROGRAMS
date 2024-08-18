package a;

import java.util.Scanner;

public class ZG_42_Convert_Num_To_Word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		A_Methods.convertNumToWord((n / 10000000), "crore");
		A_Methods.convertNumToWord((n / 100000) % 100, "lakh");
		A_Methods.convertNumToWord((n / 1000) % 100, "thousand");
		A_Methods.convertNumToWord((n / 100) % 10, "hundred");
		A_Methods.convertNumToWord((n % 100), " ");
		sc.close();
	}

}
