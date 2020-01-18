package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String args[]) {
		int[] intArray = {20,35,-15,7,55,1,-22};
		//ui unsorted index
		
		System.out.println("array.length : "+ intArray.length);
		for(int index = intArray.length-1; index > 0 ; index--) {
			int largest = 0;
			for(int i = 1 ; i <= index; i++) {
				if(intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			System.out.println("LARGEST INDEX: " + largest);
			swap(index, largest, intArray);
		}
		System.out.println(Arrays.toString(intArray));
	}
	public static void swap(int i, int j, int[] arr) {
		int temp  = arr[i];
		arr[i] = arr[j];
		arr[j] =temp;
	}
}
