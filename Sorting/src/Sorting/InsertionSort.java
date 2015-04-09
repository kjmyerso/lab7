package Sorting;


public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */

	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		for (int i = 1; i < unsortedArray.length; i ++) {
			int curr = i;
			int j = i - 1;
			while (unsortedArray[curr] < unsortedArray[j] && j > 0) {
				int temp = unsortedArray[j];
				unsortedArray[j] = unsortedArray[curr];
				unsortedArray[curr] = temp;
				curr = j;
				j --;
			}
		}	
		return unsortedArray;
	}

}
