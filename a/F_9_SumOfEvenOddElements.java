package a;

import java.util.Scanner;

public class F_9_SumOfEvenOddElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.print("Insert value into array :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.print("Do you want to print sum of array values : (Y/N)");
		char ch1=sc.next().charAt(0);
		if(ch1=='Y'||ch1=='y') {
			System.out.println("Sum of even elements :"+A_Methods.sumEvenElement(a));
			System.out.println("Sum of odd elements :"+A_Methods.sumOddElement(a));
		}
		sc.close();
	}

}
