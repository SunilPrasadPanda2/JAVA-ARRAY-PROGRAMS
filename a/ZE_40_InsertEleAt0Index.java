package a;

public class ZE_40_InsertEleAt0Index {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=1;a[1]=2;a[2]=3;a[3]=4;
		int ele=5;
		a=A_Methods.insertEleAt0Index(a, ele);
		for(int m:a) {
			System.out.print(m+" ");
		}
	}

}
