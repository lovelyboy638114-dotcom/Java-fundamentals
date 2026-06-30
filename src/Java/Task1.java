package Java;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Arul");
        students.add("Priya");
        students.add("Ravi");
        students.add("Kumar");
        students.add("Divya");

        System.out.println("Student Names:");
        System.out.println(students);

        students.add("Guna"); 
        students.add(null);   

        System.out.println("After Adding Duplicate and Null:");
        System.out.println(students);

        System.out.println("Size: " + students.size());
    }
}