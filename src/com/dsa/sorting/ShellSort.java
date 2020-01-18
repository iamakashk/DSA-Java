package com.dsa.sorting;

import java.util.Arrays;

public class ShellSort {

	public static void main(String args[]) {
		int[] arr = {20,35,-15,7,55,1,-22};
		
		for(int gap  = arr.length/2 ; gap >  0 ; gap /= 2) {
			System.out.println("gap: "+ gap);
			
			for(int i = gap ; i < arr.length; i++) {
				int newElement = arr[i];
				int j = i;
				while(j> 0 && arr[j-gap]>newElement) {
					arr[j] = arr[j-gap];
					j -= gap;
				}
				arr[j] = newElement;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
