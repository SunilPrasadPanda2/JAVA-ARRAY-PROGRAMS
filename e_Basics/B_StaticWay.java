package a_Basics;

public class B_StaticWay {

	public static void main(String[] args) {

		// static way to create array
		int[][] a = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 }, { 9, 10, 11, 12 } };
		/*
		 * If an array dont have same cols in each row then that array is called jagged
		 * array
		 */

		// print array element using for loop
		System.out.println("Array ele using for loop :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		// print array element using for loop
		System.out.println("Array ele using for-each loop :");
		for (int[] m : a) {
			for (int n : m) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
	}

}
