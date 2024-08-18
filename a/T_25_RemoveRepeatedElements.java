package a;

public class T_25_RemoveRepeatedElements {

	public static void main(String[] args) {
		int[] a= {5,1,3,3,1,1,6,7};
		a=A_Methods.removeRepeatedElements(a);
		for(int n:a) {
			if(n!=0) {
				System.out.print(n+" ");
			}
		}

	}

}
