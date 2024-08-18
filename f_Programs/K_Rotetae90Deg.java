package b_Programs;

public class K_Rotetae90Deg {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b=A_Methods.rotate90Deg(a);
		for (int[] m : b) {
			for (int n : m) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}

	}

}
