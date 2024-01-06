package com.Que3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
   public static void main(String[] args) {
	
	   List<String> list = new ArrayList<>();
	   
	   list.add("ram");
	   list.add("shyam");
	   list.add("rajmal");
	   list.add("Anisha");
	   list.add("Mukut");
	   list.add("Hement");
	   
	   int length = list.stream().mapToInt(String::length).max().orElse(0);
	   
	   List<String> filterList = list.stream().filter(s -> s.length() == length).collect(Collectors.toList());
	   
	   System.out.println(filterList);
	   
}
}
