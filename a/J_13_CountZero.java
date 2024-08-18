package a;

import java.util.Scanner;

public class J_13_CountZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.print("Insert value into array :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.print("Do you want to print prime nums of array : (Y/N)");
		char ch1=sc.next().charAt(0);
		if(ch1=='Y'||ch1=='y') {
			System.out.println("Num of 0 in array is :"+A_Methods.count(a));
		}
		sc.close();

	}

}
