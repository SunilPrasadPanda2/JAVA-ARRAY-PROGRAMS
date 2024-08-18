package a;

import java.util.Scanner;

public class K_14_InserEvenElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array :");
		int size = sc.nextInt();

		int[] a = new int[size];
		int[] res = A_Methods.insertEvenValues(a);

		for (int n : res) {
			System.out.print(n + " ");
		}
		sc.close();
	}

}
