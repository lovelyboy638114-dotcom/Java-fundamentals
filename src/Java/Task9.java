package Java;

import java.util.TreeSet;

public class Task9 {
    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);
        marks.add(95);

        System.out.println("Sorted Marks: " + marks);

        System.out.println("Descending Order: " + marks.descendingSet());

        System.out.println("First Mark: " + marks.first());

        System.out.println("Last Mark: " + marks.last());

        System.out.println("Contains 85: " + marks.contains(85));

        System.out.println("Less Than 85: " + marks.headSet(85));

        System.out.println("Greater Than or Equal 85: " + marks.tailSet(85));

        marks.remove(65);

        System.out.println("After Removing 65: " + marks);

        System.out.println("Total Marks: " + marks.size());
    }
}