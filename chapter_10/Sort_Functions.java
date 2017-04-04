package chapter_10;

public class Sort_Functions {
	
	public static void insertionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while(j>0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int minIndex = i;
			int j = i;
			for(; j<arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 2, 3, 8, 9, 1, 6, 7};
		insertionSort(arr);
		for(int in : arr) {
			System.out.printf(in+" ");
		}
		System.out.println("");
		int[] arr2 = {4, 5, 2, 3, 8, 9, 1, 6, 7};
		selectionSort(arr2);
		for(int in : arr2) {
			System.out.printf(in+" ");
		}
	}

}
