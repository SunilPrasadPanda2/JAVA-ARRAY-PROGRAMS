package a;

import java.util.Scanner;

public class A_Methods {

	public static void printIntArrayVal(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void printIntArrayValRev(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void printCharArrayVal(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void printCharArrayValRev(char[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void printEvenIndexOfStringArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void printOddIndexOfStringArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void printEvenElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void printOddElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int sumEvenIndex(int[] arr) {
		int sumEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sumEven += arr[i];
			}
		}
		return sumEven;
	}

	public static int sumOddIndex(int[] arr) {
		int sumOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sumOdd += arr[i];
			}
		}
		return sumOdd;
	}

	public static int sumEvenElement(int[] arr) {
		int sumEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sumEven += arr[i];
			}
		}
		return sumEven;
	}

	public static int sumOddElement(int[] arr) {
		int sumOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sumOdd += arr[i];
			}
		}
		return sumOdd;
	}

	public static boolean isPrime(int i) {
		if (i <= 1)
			return false;
		for (int j = 2; j < i / 2; j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}

	public static boolean isOval(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}

	public static int count(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count += 1;
			}
		}
		return count;
	}

	public static int[] insertEvenValues(int[] arr) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[arr.length];
		int count = 0;

		System.out.print("Enter array elements :");
		for (int i = 0; i < a.length; i++) {
			int n = sc.nextInt();
			if (n % 2 == 0) {
				a[count] = n;
				count += 1;
			}
		}
		sc.close();
		return a;
	}

	public static int lastIndex(int[] a, int key) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void countOccurence(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count += 1;
					a[j] = 0;
				}
			}
			if (a[i] != 0) {
				System.out.println(a[i] + "=" + count);
			}
		}
	}

	public static int[] squareElement(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int sq = a[i] * a[i];
			a[i] = sq;
		}
		return a;
	}

	public static void maxOccur(int[] a) {
		int max = a[0];
		int maxCount = 1;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count += 1;
				}
			}
			if (maxCount < count) {
				maxCount = count;
				max = a[i];
			}
		}
		System.out.println(max + " occured max time i.e : " + maxCount);
	}

	public static void minOccur(int[] a) {
		int min = a[0];
		int minCount = a.length;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count += 1;
				}
			}
			if (minCount > count) {
				minCount = count;
				min = a[i];
			}
		}
		System.out.println(min + " occured max time i.e : " + minCount);
	}

	public static int largestElement(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= max) {
				max = a[i];
			}
		}
		return max;
	}

	public static int smallestElement(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= min) {
				min = a[i];
			}
		}
		return min;
	}

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

	public static int[] convert_0_To_minus_1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				a[i] = -1;
			} else if (a[i] == -1) {
				a[i] = 0;
			}
		}
		return a;
	}

	public static int[] removeRepeatedElements(int[] arr) {
		int[] a = new int[arr.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (arr[i] == arr[j]) {
					count += 1;
					arr[j] = 0;
				}
			}
			if (count == 1) {
				a[index] = arr[i];
				index += 1;
			}
		}
		return a;
	}

	public static int sumOfEvenDig(int a) {
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;
			if (rem % 2 == 0) {
				sum += rem;
			}
			a /= 10;
		}
		return sum;
	}

	public static int[] sumOfEvenDigArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int evenSum = sumOfEvenDig(a[i]);
			a[i] = evenSum;
		}
		return a;
	}

	public static int lengthOfArray(int[] a) {
		int len = 0;
		for (@SuppressWarnings("unused")
		int n : a) {
			len += 1;
		}
		return len;
	}

	public static int sumUptoSingleDig(int i) {
		if (i == 0) {
			return 0;
		}
		int a = i % 10 + sumUptoSingleDig(i / 10);
		if (a > 9) {
			return sumUptoSingleDig(a);
		}
		return a;
	}

	public static int[] addElement(int[] arr, int ele, int index) {
		int[] a = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			if (i >= index) {
				if (i == index) {
					a[i] = ele;
				}
				a[i + 1] = arr[i];
			} else {
				a[i] = arr[i];
			}
		}
		return a;
	}

	public static int[] removeElement(int[] arr, int index) {
		int[] a = new int[arr.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (i >= index) {
				a[i] = arr[i + 1];
			} else {
				a[i] = arr[i];
			}
		}
		return a;
	}

	public static void findDistinctEle(int[] a, int[] b) {
		int[] arr = new int[(a.length) + (b.length)];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = false;
				}
				if (flag == true && j == b.length - 1) {
					arr[index] = a[i];
					index += 1;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			boolean flag = true;
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					flag = false;
				}
				if (flag == true && j == a.length - 1) {
					arr[index] = b[i];
					index += 1;
				}
			}
		}
		for (int n : arr) {
			if (n != 0) {
				System.out.print(n + " ");
			}
		}
	}

	public static void findCommonEle(int[] a, int[] b) {
		int small = a.length < b.length ? a.length : b.length;
		int[] arr = new int[small];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					arr[index] = a[i];
					index += 1;
					break;
				}
			}
		}
		for (int n : arr) {
			if (n != 0) {
				System.out.print(n + " ");
			}
		}
	}

	public static int[] shiftElementRight(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
		}
		return a;
	}

	public static void removeDuplicates(int[] a) {
		int newSize = a.length - 1;
		for (int i = 0; i < newSize; i++) {
			for (int j = i + 1; j < newSize; j++) {
				if (a[i] == a[j]) {
					for (int k = j; k < newSize; k++) {
						a[k] = a[k + 1];
					}
					newSize -= 1;
					j -= 1;
				}
			}
		}
		for (int i = 0; i <= newSize; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void printMissingEle(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int cur = a[i];
			int next = a[i + 1];
			for (int j = cur + 1; j < next; j++) {
				System.out.print(j + " ");
			}
		}
	}

	public static char[] sortCharacterArray(char[] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length - 1 - i; j++) {
				if (c[j] > c[j + 1]) {
					char temp = c[j + 1];
					c[j + 1] = c[j];
					c[j] = temp;
				}
			}
		}
		return c;
	}

	public static String[] sortStringArray(String[] s) {
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length - 1 - i; j++) {
				if (s[j].charAt(0) > s[j + 1].charAt(0)) {
					String temp = s[j + 1];
					s[j + 1] = s[j];
					s[j] = temp;
				}
			}
		}
		return s;
	}

	public static int[] insertEleAt0Index(int[] a, int ele) {
		if (a[a.length - 1] == 0) {
			for (int i = a.length - 1; i >= 1; i--) {
				a[i] = a[i - 1];
			}
			a[0] = ele;
		}
		return a;
	}

	public static int[] printEleFromGivenIndex(int[] a, int index) {
		int len = a.length - index;
		int[] res = new int[len];
		for (int i = 0; i < res.length; i++) {
			res[i] = a[index];
			index++;
		}
		return res;
	}

	public static void convertNumToWord(int n, String s) {
		String[] one = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] two = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		if (n <= 19) {
			System.out.print(one[n] + " ");
		} else {
			System.out.print(two[n / 10] + one[n % 10] + " ");
		}
		if (n != 0) {
			System.out.print(s + " ");
		}
	}

	public static int[] shuffle(int[] a) {
		int[] res = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int n = (int) (Math.random() * a.length);
			while (true) {
				if (res[n] == 0) {
					res[n] = a[i];
					break;
				} else {
					n = (int) (Math.random() * a.length);
				}
			}
		}
		return res;
	}
}
