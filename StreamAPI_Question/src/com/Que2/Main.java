package com.Que2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
   public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(11);
	list.add(2);
	list.add(23);
	list.add(4);
	list.add(5);
	list.add(0);
	list.add(7);
	list.add(8);
	list.add(24);
	list.add(12);
	
	List<Integer> filterList = list.stream().filter(s -> s%2 == 0).collect(Collectors.toList());
	
	for(Integer i : filterList) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	 int sum = filterList.stream().mapToInt(s -> s * s).sum();
	 System.out.println(sum);
 }
}
