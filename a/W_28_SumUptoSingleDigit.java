package a;

public class W_28_SumUptoSingleDigit {

	public static void main(String[] args) {
		int[] a= {23,55,57,93,10,1};
		for(int i=0;i<a.length;i++) {
			a[i]=A_Methods.sumUptoSingleDig(a[i]);
			System.out.print(a[i]+" ");
		}
	}

}
