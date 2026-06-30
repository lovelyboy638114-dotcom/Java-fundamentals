package Java;

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {

        LinkedList<String> products = new LinkedList<>();

        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");

        products.addFirst("Mobile");

        products.addLast("Printer");

        products.removeFirst();

        products.removeLast();

        System.out.println("Products:");
        System.out.println(products);
    }
}