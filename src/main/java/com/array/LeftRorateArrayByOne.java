package com.array;

public class LeftRorateArrayByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,7,8,9,5};
		leftRotateArrayByOne(arr);
		for(int k : arr) {
			System.out.println("Rotated array : "+ k);
		}
	}

	public static void leftRotateArrayByOne(int arr[]) {
		int temp = arr[0];
		for(int i = 1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
	}
}
