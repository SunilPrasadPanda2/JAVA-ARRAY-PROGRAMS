package b_Programs;

public class I_MatrixMultiplication {

	public static void main(String[] args) {
		int[][] a = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int[][] b = { { 1, 2, 3 }, { 3, 2, 1 }, { 1, 3, 2 } };
		
		int[][] c=A_Methods.matrixMultiplication(a, b);
		for(int[] m:c) {
			for(int n:m) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}

}
