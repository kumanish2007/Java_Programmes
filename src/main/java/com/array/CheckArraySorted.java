package com.array;

public class CheckArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,4,13,50,20};
		System.out.println("Sorted array :"+ isSorted(arr));
		int arr1[] = {1,4,13,50,60};
		System.out.println("Sorted array :"+ isSorted(arr1));
	
		int arr2[] = {1,4,13,55,60};
		System.out.println("Is Sorted array2 :"+ isSorted(arr2));
	
	}
	
	/*
	 * Naive approach
	 */
	public static boolean isSorted(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]<arr[i])
					return false;
			}
		}
		return true;
	}

	/*
	 * Efficient approach
	 */
	public static boolean isSorted2(int arr[]) {
		for(int i = 1; i<arr.length; i++) {
				if(arr[i] > arr[i-1])
					return true;
			}
		return false;
	}
}
