package com.array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,5,1,5};
		reverseArray(arr);
	}
	
	public static void reverseArray(int arr[]) {
		int low = 0, high = arr.length-1;
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Reverse array : "+ arr[i]);
		}
	}
}
