import java.util.Scanner;

class MergeSort { 
		//mergeSort algorithm found on geekforgeeks

		/*
		 * I believe that merge sort is more efficient than bubble sort
		 * especially when it comes to large data sets that contain a 
		 * lot of numbers.
		 */
	void merge(int arr[], int l, int m, int r) 
	{ 
		int n1 = m - l + 1; 
		int n2 = r - m; 

		int L[] = new int[n1]; 
		int R[] = new int[n2]; 

		for (int i = 0; i < n1; ++i) 
			L[i] = arr[l + i]; 
		for (int j = 0; j < n2; ++j) 
			R[j] = arr[m + 1 + j]; 

		int i = 0, j = 0; 
		int k = l; 
		while (i < n1 && j < n2) { 
			if (L[i] <= R[j]) { 
				arr[k] = L[i]; 
				i++; 
			} 
			else { 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 
		while (i < n1) { 
			arr[k] = L[i]; 
			i++; 
			k++; 
		} 
		while (j < n2) { 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 
	} 
	void sort(int arr[], int l, int r) 
	{ 
		if (l < r) { 
			int m = (l + r) / 2; 
			sort(arr, l, m); 
			sort(arr, m + 1, r); 
			merge(arr, l, m, r); 
		} 
	} 
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 
	public static void main(String args[]) 
	{ 
        Scanner scnr = new Scanner(System.in);
		int number;
		int[] arr;
        System.out.println("Input x numbers for array: ");
		number = scnr.nextInt();
		arr = new int[number];
		System.out.println("Numbers in the array:");
		for (int i=0; i<arr.length; i++){
			arr[i] = scnr.nextInt();
		}

		System.out.println("Given Array"); 
		printArray(arr); 

		MergeSort ob = new MergeSort(); 
		ob.sort(arr, 0, arr.length - 1); 
		System.out.println();
		System.out.println("Sorted array"); 
		printArray(arr); 
		scnr.close();
	} 
}

