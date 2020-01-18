package com.dsa.sorting;
import java.util.Arrays;
/**
 * @author AKASH
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String args[]){
		int[] intArray = {20,35,-15,7,55,1,-22};

		for(int i  = intArray.length-1 ; i >= 0 ; i--){
			for(int j  = 0 ; j <= i-1; j++){
				if(intArray[j] > intArray[j+1]){
					swap(intArray, j, j+1);
				}
			}
		}
		System.out.println(Arrays.toString(intArray));

	}

	public static void swap(int[] array, int i, int j){
		if(i==j){
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp; 
	}
}
