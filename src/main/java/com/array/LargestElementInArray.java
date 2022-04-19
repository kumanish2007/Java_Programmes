package com.array;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,8,60,80};
		System.out.println("Index of Largest Element : "+ getLargest(arr));
		System.out.println("======Best approach======");
		int k[] = {12,5,67,89,90};
		System.out.println("Index of Largest Element : "+ getLargest2(k));
	}

	/*
	 * Naive Approach
	 */
	public static int getLargest(int arr[]) {
	int n = arr.length;
	for(int i = 0; i<n; i++) {
		boolean flag  = true;
		for(int j = 0; j<n; j++) {
			if(arr[j] > arr[i]) {
				flag = false;
				break;
			}
		}
		if(flag == true)
			return i;
	}
	return -1;
	}
	
	/*
	 * Second efficient approach
	 */
	public static int getLargest2(int arr[]) {
		int n = arr.length;
		int res = 0;
		for(int i = 1; i<n; i++) {
			if(arr[i] > arr[res]) {
				res = i;
			}
		}
		return arr[res];
	}
}
