package c_Searching;

public class C2_BinarySearchRecursion {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		//In binary search array must be in sorted order
		
		int key=7;
		System.out.println("index of "+key+" is :"+A_Methods.binarySearchRecur(a, key, 0, a.length-1));

	}

}
