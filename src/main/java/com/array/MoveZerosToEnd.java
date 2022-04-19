package com.array;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,0,3,8,0,0,8,9};
		moveZerosEnd(a);
		System.out.println("Zeros moved to end of the array");
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		int arr1[] = {2,0,5,0,9,0,0};
		moveZerosToEnd(arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("Zeros moved :"+ arr1[i]);
		}
	}
	
	/*
	 * Naive approach
	 */
	public static void moveZerosEnd(int[] arr) {
		int n = arr.length;
		int temp;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				for (int j = 1; j < n; j++) {
					if (arr[j] != 0) {
						// swap(arr[i], arr[j]);
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Moved zeros to an end :" + arr[i]);
		}
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp;
		temp = i;
		i = j;
		j = temp;
		//System.out.println("swap :"+ i +" "+j);
	}
	
	/*
	 * Efficient approach
	 */
	public static void moveZerosToEnd(int arr[]) {
		int count = 0;
		int temp;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
	}
}
