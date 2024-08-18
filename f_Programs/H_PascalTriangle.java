package b_Programs;

public class H_PascalTriangle {

	public static void main(String[] args) {
		int[][] a=new int[6][];
		a=A_Methods.pascal(a);
		int sp=a.length-1;
		for(int[] m:a) {
			for(int i=0;i<sp;i++) {
				System.out.print(" ");
			}
			for(int n:m) {
				System.out.print(n+" ");
			}
			sp--;
			System.out.println();
		}

	}

}
