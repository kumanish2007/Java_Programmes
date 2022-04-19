/**
 * 
 */
package com.search;

/**
 * @author Lenovo
 *
 */
public class SortedRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] sortedArray = {34, 25, 5, 60,78,90,40};
		int x = 5;
		int y = sortedArray(sortedArray, x);
		System.out.println("Index of searched item : "+ y);
	}

	public static int sortedArray(int[] arr, int x) {
		for(int i =0 ; i<arr.length; i++)
		{
			if(arr[i] == x)
				return i; 
		}
		return -1;
	}
}
