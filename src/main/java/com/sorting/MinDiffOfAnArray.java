/**
 * 
 */
package com.sorting;

import java.util.Arrays;

/**
 * @author Lenovo
 *
 */
public class MinDiffOfAnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,3,8};
		int k = getMinDiff(a, a.length);
		System.out.println("Value of k :"+ k);
		
		int kk = getMinDiff1(a, a.length);
		System.out.println("Value of kkkk :"+ kk);
	}

	public static int getMinDiff(int arr[], int n) {
		int res = Integer.MAX_VALUE;
		for(int i = 1; i<n; i++) {
			for(int j = 0; j<i; j++) {
				res = Math.min(res, Math.abs(arr[i]-arr[j]));
			}
		}
		return res;
	}
	
	/*First sorting an array then getting min diff */
	public static int getMinDiff1(int arr[], int n) {
		int res = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i = 1; i<n; i++) {
				res = Math.min(res, Math.abs(arr[i]-arr[i-1]));
		}
		return res;
	}

}
