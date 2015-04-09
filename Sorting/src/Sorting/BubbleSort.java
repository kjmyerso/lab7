package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] list) {
		for (int x = 0; x < list.length; x ++) {
			boolean swapped = false;
			for (int y = 0; y < list.length - x - 1 ; y ++) {
				if (list[y] > list[y+1]) {
					int temp = list[y];
					list[y] = list[y+1];
					list[y+1]= temp;
					swapped = true;
				} 		
			}
			if (! swapped ) return list;
		}
		return list;
	}
}
