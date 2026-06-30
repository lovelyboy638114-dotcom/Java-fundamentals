package Java;

import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {

        LinkedList<String> customers = new LinkedList<>();

        customers.add("Guna");
        customers.add("Priya");
        customers.add("Ravi");
        customers.add("Arul");

        customers.addFirst("Kumar");

        customers.addLast("Divya");

        System.out.println("First Customer: " + customers.getFirst());

        System.out.println("Last Customer: " + customers.getLast());

        customers.removeFirst();

        customers.removeLast();

        System.out.println("Contains Ravi: " + customers.contains("Ravi"));

        System.out.println("Number of Customers: " + customers.size());

        System.out.println("Customers:");
        System.out.println(customers);
    }
}