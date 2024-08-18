package c_Searching;

import java.util.Scanner;

public class B_LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		int size = sc.nextInt();

		int[] a = new int[size];
		
		System.out.print("Enter array elements :");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}

		System.out.print("Enter key element : ");
		int key=sc.nextInt();
		
		System.out.println("Index of "+key+" is : "+A_Methods.linearSearch(a, key));
		sc.close();
	}

}
