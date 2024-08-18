package d_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class D_SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.print("Enter the array elements :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		A_Methods.selectionSort(a);
		
		System.out.println("Sorted array elements are :");
		System.out.println(Arrays.toString(a));
		sc.close();

	}

}
