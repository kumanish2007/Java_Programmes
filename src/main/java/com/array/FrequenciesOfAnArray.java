package com.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequenciesOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,8,9,5,6,9,8};
		countFreq(arr);
	}
	
	 static void countFreq(int arr[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int a : arr) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}	
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +"  "+entry.getValue());
			}
		
	}

}
