package Java;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.add("John");
        employees.add("David");
        employees.add("Smith");
        employees.add("Arun");

        employees.add(1, "Kumar");

        employees.remove("Smith");

        System.out.println("Contains David: " + employees.contains("David"));

        System.out.println("Index of Kumar: " + employees.indexOf("Kumar"));

        employees.set(0, "Robert");

        System.out.println("Employee at index 2: " + employees.get(2));

        System.out.println("Is Empty: " + employees.isEmpty());

        System.out.println("Total Employees: " + employees.size());

        System.out.println("Employee List: " + employees);

        employees.clear();

        System.out.println("After Clear: " + employees);
    }
}