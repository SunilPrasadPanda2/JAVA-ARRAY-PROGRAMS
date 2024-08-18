package a;

public class ZF_41_PrintFromGivenIndex {

	public static void main(String[] args) {
		int[] a= {1,2,4,5,1,3,2};
		int index=5;
		int[] res=A_Methods.printEleFromGivenIndex(a, index);
		for(int m:res) {
			System.out.print(m+" ");
		}

	}

}
