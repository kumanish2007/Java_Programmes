package com.search;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> list =  Arrays.asList("manish", "kumar", "bangalore", "karnataka");
		System.out.println("List of String : "+ list);
		
		String st = list.stream().collect(Collectors.joining(","));
		System.out.println("Collector : "+ st);
		
		String stt = String.join("     ", list);
		System.out.println("MMKKkk : "+ stt);
		/* Using String buffer */
		
		StringBuffer sb = new StringBuffer();
		for(String st1 : list) {
			sb.append(st1).append(",");
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		System.out.println("String buffer : "+ sb);
		
	}
}
