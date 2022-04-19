package com.array;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(12);
	list.add(4);
	list.add(40);
	list.add(50);
	System.out.println(list);
	
	int a[] = {1, 8};
	
	list.add(a[0], a[1]);
	list.remove(0);
	System.out.println(list);
	
	System.out.println(fibonacci(1));
}
 static long fibonacci(int n) {
    return (long) ((Math.pow(1 + Math.sqrt(5), n) - Math.pow(1 - Math.sqrt(5), n)) /
        (Math.pow(2, n) * Math.sqrt(5)));
}
}
