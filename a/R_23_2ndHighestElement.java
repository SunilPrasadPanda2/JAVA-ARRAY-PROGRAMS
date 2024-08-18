package a;

public class R_23_2ndHighestElement {

	public static int secondHighest(int[] a) {
		int max1 = a[0];
		int max2 = a[1];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max2 = max1;
				max1 = a[i];
			} else if (a[i] > max2 && a[i] != max1) {
				max2 = a[i];
			}
		}
		return max2;
	}

	public static void main(String[] args) {
		int[] a = { 20, 1, 2, 3, 5, 30, 7, 8, 10, 30, 20 };
		System.out.println("2nd highest element is :" + secondHighest(a));

	}

}
