package com.revature.sort;

public class MergeSort {
	
	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		//base case
		if(arr.length < 2) {
			return;
		}
		//get the 2 split lists
		int middle = arr.length/2;
		int[] left = new int [middle];
		int[] right = new int[arr.length - middle];
		
		//put array values in the lists
		for(int i = 0; i < middle; i++) {
			left[i] = arr[i];
		}
		for(int i = 0; i < arr.length - middle; i++) {
			right[i] = arr[i + middle];
		}
		sort(left);
		sort(right);
		merge(arr, left, right);
	}
	
	private static void merge(int[] arr, int[] left, int[] right) {
		// TODO Auto-generated method stub
		int i = 0; //left index
		int j = 0; //right index
		int index = 0; //combined index
		while(i < left.length && j < right.length) {
			if(left[i] > right[j]) {
				arr[index] = right[j];
				j++;
				index++;
			}
			else {
				arr[index] = left[i];
				i++;
				index++;
			}
		}
		if(i < left.length) {
			for(; i < left.length; i++) {
				arr[index] = left[i];
				index++;
			}
		}
		else {
			for(; j < right.length; j++) {
				arr[index] = right[j];
				index++;
			}
		}
	}
}
