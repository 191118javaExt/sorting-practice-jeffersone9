package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		boolean sorted; //this will return true if we go a whole pass without swapping
		//a temp variable to store a value for swapping
		int temp;
		do {
			//loop starts with sorted being true and will be false if any swaps happen
			sorted = true;
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i + 1]) {
					sorted = false;
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}while(!sorted);
	}
}
