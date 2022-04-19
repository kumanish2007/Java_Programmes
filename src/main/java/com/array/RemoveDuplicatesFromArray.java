package com.array;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,30,30,20,20};
		System.out.println("Removes duplicates :" + removeDuplicates(arr, arr.length));
		
		int arr2[] = {12,30,30,20,20,80};
		System.out.println("Removes duplicates from arr2 : " + removeDuplicates2(arr2, arr2.length));
	}

	/*
	 * Naive method
	 */
	public static int removeDuplicates(int arr[], int n) {
		int temp[] = new int[n];
		temp[0] = arr[0];
		int res = 1;
		for(int i = 1; i<n; i++) {
			if(temp[res-1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}
		for(int i = 0; i< res; i++) {
			arr[i] = temp[res];
		}
		for(int i = 0; i< temp.length; i++) {
			System.out.println("removed duplicates : "+ temp[i]);
		}
		return res;
	}
	
	/*
	 * Efficient approach
	 */
	public static int removeDuplicates2(int arr[], int n) {
		int res = 1;
		for(int i = 1; i<n; i++) {
			if(arr[i] != arr[res-1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}
}
