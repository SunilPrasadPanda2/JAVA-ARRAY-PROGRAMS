package b_Programs;

import java.util.Scanner;

public class L_SpiralMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size=sc.nextInt();
		int[][] a=new int[size][size];
		a=A_Methods.spiralMatrix(a);
		for (int[] m : a) {
			for (int n : m) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
