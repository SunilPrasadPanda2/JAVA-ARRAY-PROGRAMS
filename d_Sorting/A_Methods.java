package d_Sorting;

public class A_Methods {

	public static void normalSortAsc(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j] > a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public static void normalSortDsc(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j] < a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index]) {
					index = j;
				}
			}
			if (i != index) {
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
		}
	}

	public static void quickSort(int[] a, int st, int end) {
		if (st >= end) {
			return;
		}
		int i = st;
		int j = end;

		int pivot = (st + end) / 2;
		while (a[i] < a[pivot]) {
			i++;
		}
		while (a[j] > a[pivot]) {
			j--;
		}
		if (i <= j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		i++;
		j--;
		quickSort(a,st,j);
		quickSort(a,i,end);
	}
	
	public static void mergeSort(int[] a) {
		if(a.length==1) {
			return;
		}
		int[] left=new int[a.length/2];
		int[] right=new int[(a.length)-(left.length)];
		
		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, left.length, right, 0, right.length);
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left, right, a);
	}
	public static void merge(int[] a,int[] b,int[] c) {
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}else {
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(i < a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
	}
}
