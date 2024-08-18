package b_Programs;

public class J_TransposeOfMatrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5} };
		int[][] b = A_Methods.transposeOfmatrix(a);
		if (b.length != 0) {
			for (int[] m : b) {
				for (int n : m) {
					System.out.print(n + "\t");
				}
				System.out.println();
			}
		}

	}

}
