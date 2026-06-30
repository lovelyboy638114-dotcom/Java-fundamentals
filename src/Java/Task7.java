package Java;

import java.util.LinkedHashSet;

public class Task7 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> regNumbers = new LinkedHashSet<>();

        regNumbers.add(201);
        regNumbers.add(202);
        regNumbers.add(203);
        regNumbers.add(201);
        regNumbers.add(204);
        regNumbers.add(205);
        regNumbers.add(202);

        System.out.println("Registration Numbers:");
        System.out.println(regNumbers);
    }
}