package com.Que1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    
	public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Rajmal", 24));
        list.add(new Employee(2, "Anisha", 22));
        list.add(new Employee(3, "Mukut", 27));
        list.add(new Employee(4, "Anu", 22));
        list.add(new Employee(5, "Anjali", 22));

        List<Employee> updatedList = list.stream()
                .filter(e -> e.getName().startsWith("A"))
                .filter(e -> e.getId() % 2 != 0)
                .filter(e -> e.getAge() % 2 == 0)
                .collect(Collectors.toList());

        for (Employee emp : updatedList) {
            System.out.println(emp);
        }
       
}
}
