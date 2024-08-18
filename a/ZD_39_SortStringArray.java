package a;

public class ZD_39_SortStringArray {

	public static void main(String[] args) {
		String[] s = { "Ram", "Amar", "Cel", "David", "Bunny" };
		s = A_Methods.sortStringArray(s);
		for (String m : s) {
			System.out.print(m + " ");
		}
	}

}
