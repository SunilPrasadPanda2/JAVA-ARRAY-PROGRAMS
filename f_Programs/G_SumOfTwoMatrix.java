package b_Programs;

public class G_SumOfTwoMatrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int[][] res=A_Methods.add(a, b);
		for(int[] m:res) {
			for(int n:m) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}

	}

}
