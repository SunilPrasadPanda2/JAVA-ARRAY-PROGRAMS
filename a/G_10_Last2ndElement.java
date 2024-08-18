package a;

import java.util.Scanner;

public class G_10_Last2ndElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.print("Insert value into array :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		int index=a.length-2;
		System.out.println("2nd last elemet is :"+a[index]);
		sc.close();

	}

}
