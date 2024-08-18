package c_Searching;

public class A_Methods {

	public static int linearSearch(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}
	
	public static int binarySearchLoop(int[] a, int key) {
		int st = 0;
		int last = a.length - 1;
		while (st <= last) {
			int mid = ((st + last) / 2);
			if (key == a[mid])
				return mid;
			else if (key < a[mid])
				last = mid - 1;
			else
				st = mid + 1;
		}
		return -1;
	}

	public static int binarySearchRecur(int[] a, int key, int st, int last) {
		if (st > last)
			return -1;
		int mid = ((st + last) / 2);
		if (key == a[mid])
			return mid;
		else if (key < a[mid])
			return binarySearchRecur(a, key, st, mid - 1);
		else
			return binarySearchRecur(a, key, mid + 1, last);
	}
}
