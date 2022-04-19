package com.sorting;

public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,3,8,8};
		int b[] = {5,1,3,8,8};
		intersectionOfTwoSortedArrays(a, b, a.length, b.length);
		System.out.println("------");
	}

	public static void intersectionOfTwoSortedArrays(int a[], int b[], int n, int m) {
		for(int i = 0; i<n; i++) {
			if(i>0 && a[i] == a[i-1]) {
				continue;
			}
			for(int j = 0; j<m; j++) {
				if(a[i] == b[j]) {
					System.out.println("Intersection of an array : "+ a[i]);
					break;
				}
			}
		}
	}
}
