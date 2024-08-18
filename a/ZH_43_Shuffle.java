package a;

import java.util.Arrays;

public class ZH_43_Shuffle {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		a = A_Methods.shuffle(a);
		System.out.println(Arrays.toString(a));

	}

}
