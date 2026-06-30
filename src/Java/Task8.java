package Java;

import java.util.TreeSet;

public class Task8 {
    public static void main(String[] args) {

        TreeSet<Integer> employeeIds = new TreeSet<>();

        employeeIds.add(105);
        employeeIds.add(102);
        employeeIds.add(109);
        employeeIds.add(101);
        employeeIds.add(103);
        employeeIds.add(102);

        System.out.println("Employee IDs:");

        for(Integer id : employeeIds) {
            System.out.println(id);
        }
    }
}