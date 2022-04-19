package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,5,2,6,4};
		bubbleSort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Bubble sorted : "+ arr[i]);
		}
	}
	
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-1; j++) {
				if(arr[j] > arr[j+1]) {
					//swap arr[j] with arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
