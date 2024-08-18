package a_Basics;

import java.util.Scanner;

public class A_Create {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter number of cols : ");
		int cols = sc.nextInt();

		int[][] a = new int[rows][cols];
		// assigning row size is mandatory and col size is optional

		// Insert array elements
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter " + (i + 1) + "th row " + (j + 1) + "th col ele : ");
				a[i][j] = sc.nextInt();
			}
		}

		// Print array elements using for loop
		System.out.println("Array elements are :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
