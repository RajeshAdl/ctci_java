package chapter_10;

public class Merge_Sort {

	public static void mergeSort(int[] arr) {
		int[] helper = new int[arr.length];
		mergeSortHelper(arr, helper, 0, arr.length-1);
	}
	
	public static void mergeSortHelper(int[] arr, int []helper, int low, int high) {
		if(low < high) {
			int mid = (low + high) / 2;
			mergeSortHelper(arr, helper, low, mid);
			mergeSortHelper(arr, helper, mid+1, high);
			merge(arr, helper, low, mid, high);
		}
	}
	
	public static void merge(int[] arr, int []helper, int low, int middle, int high) {
		for(int i=low; i<=high; i++) {
			helper[i] = arr[i];
		}
		
		int helperLeft = low;
		int helperRight = middle+1;
		int current = low;
		
		while(helperLeft <= middle && helperRight <= high) {
			if(helper[helperLeft] < helper[helperRight]) {
				arr[current] = helper[helperLeft];
				helperLeft++;
			}
			else {
				arr[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		
		while(helperLeft <= middle) {
			arr[current] = helper[helperLeft];
			helperLeft++;
			current++;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 6, 3, 2, 1, 5, 8, 9};
		for(int i : arr) {
			System.out.printf(i+" ");
		}
		System.out.println("");
		mergeSort(arr);
		for(int i : arr) {
			System.out.printf(i+" ");
		}

	}

}
