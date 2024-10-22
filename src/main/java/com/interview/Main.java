package org.example;

import java.util.HashMap;

class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;*/
        Employee employee = (Employee) o;
        return id == employee.id;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(1);

        HashMap<Employee, String> map = new HashMap<>();
        map.put(e1, "John");
        map.put(e2, "Doe");

        System.out.println(map.size()); // What will this print? Why?
        String name = "Eshaan";
        name = "Manish";

        String name1 = new String ("Manish");
        System.out.println(name.equals(name1)); // true
        System.out.println(name == name1); //false

    }
}

