package com.array;

public class SecondLargestElement {
public static void main(String[] args) {
	int arr[] = {12,4,8,20,18};
	System.out.println("Second Largest Element index : "+ getSecondLargest(arr, arr.length));
	
	int arr1[] = {12,12,12};
	System.out.println("Second Largest Element index for arr1:"+ getSecondLargest(arr1, arr1.length));
	
	int arr2[] = {12,23,40,25};
	System.out.println("Second Largest Element index for arr2:"+ getSecondLargest1(arr2, arr2.length));
}

/*
 * Naive approach
 */
public static int getSecondLargest(int arr[], int n) {
	int largest = getLargest(arr, n);
	int res = -1;
	for(int i = 0; i<n; i++) {
		if(arr[i] != arr[largest]) {
			if(res == -1)
				res = i;
			else if (arr[i]>arr[res]) {
				res = i;
			}
		}
	}
	return res;
}

private static int getLargest(int arr[], int n) {
	int largest = 0;
	for(int i = 1; i<n; i++) {
		if(arr[i]>arr[largest])
			largest = i;
	}
	return largest;
}

/*
 * Efficient approach
 */
public static int getSecondLargest1(int arr[], int n) {
	int res = -1, largest = 0;
	for(int i=1; i<n; i++) {
		if(arr[i] > arr[largest]) {
			res = largest;
			largest = i;
		}else if(arr[i] != arr[largest]){
			if(res == -1 || arr[i] > arr[res]) {
				res = i;
			}
		}
	}
	return res;
}





}
