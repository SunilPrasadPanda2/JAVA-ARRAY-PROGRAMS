package b_Programs;

public class A_Methods {

	public static void reverse(int[][] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = a[i].length - 1; j >= 0; j--) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int sum(int[][] a) {
		int sum = 0;
		for (int[] m : a) {
			for (int n : m) {
				sum += n;
			}
		}
		return sum;
	}

	public static void firstAndLastRow(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == 0 || i == a.length - 1) {
					System.out.print(a[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

	public static void sumOfDiagonal(int[][] a) {
		int sumL = 0;
		int sumR = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					sumL += a[i][j];
				}
				if ((i + j) == (a.length - 1)) {
					sumR += a[i][j];
				}
			}
		}
		System.out.println("Sum of left diagonal : " + sumL);
		System.out.println("Sum of right diagonal : " + sumR);
	}

	public static int sumOfAllDiagonal(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j || (i + j) == (a.length - 1)) {
					sum += a[i][j];
				}
			}
		}
		return sum;
	}

	public static void belowMajorDiagonalEle(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] add(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	public static int[][] pascal(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
			for (int j = 0; j < a[i].length; j++) {
				if (j == 0 || j == a[i].length - 1) {
					a[i][j] = 1;
				} else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
				}
			}
		}
		return a;
	}

	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

	public static int[][] transposeOfmatrix(int[][] a) {
		int row = a.length;
		int col = 0;
		int[][] b = new int[0][0];
		for (int i = 0; i < a.length; i++) {
			int prvcol = col;
			col = 0;
			for (int j = 0; j < a[i].length; j++) {
				col += 1;
			}
			if (prvcol != col && i != 0) {
				System.out.println("Transpose of matrix is not possible");
				return b;
			}
		}
		b = new int[col][row];
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				b[i][j] = a[j][i];
			}
		}
		return b;
	}

	public static int[][] rotate90Deg(int[][] a) {
		int[][] b = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			int k = a.length - 1;
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = a[k][i];
				k--;
			}
		}
		return b;
	}

	public static int[][] spiralMatrix(int[][] a) {
		int size = a.length;
		int row = 0;
		int col = -1;
		char dir = 'r';
		for (int i = 1; i <= size * size; i++) {
			switch (dir) {
			case 'r': {
				col++;
				a[row][col] = i;
				if (col == a.length - 1 || a[row][col + 1] != 0) {
					dir = 'd';
				}
				break;
			}
			case 'd': {
				row++;
				a[row][col] = i;
				if (row == a.length - 1 || a[row + 1][col] != 0) {
					dir = 'l';
				}
				break;
			}
			case 'l': {
				col--;
				a[row][col] = i;
				if (col == 0 || a[row][col - 1] != 0) {
					dir = 't';
				}
				break;
			}
			case 't': {
				row--;
				a[row][col] = i;
				if (a[row - 1][col] != 0) {
					dir = 'r';
				}
				break;
			}
			}
		}
		return a;
	}
}
