package com.dsa.sorting;

import java.util.Arrays;

/**
 * @author AKASH
 *
 */
public class InsertionSort {

	public static void main(String args[]) {
		int[] arr = {20,35,-15,7,55,1,-22};
		
		for(int unsortedIndex = 1; unsortedIndex < arr.length ; unsortedIndex++) {
			int newElement = arr[unsortedIndex];
			int hole = unsortedIndex;
			
			while(hole > 0 && arr[hole-1] > newElement) {
				arr[hole] = arr[hole-1];
				hole  = hole-1;
			}
			arr[hole] = newElement;
		}
		System.out.println(Arrays.toString(arr));
	}
}
