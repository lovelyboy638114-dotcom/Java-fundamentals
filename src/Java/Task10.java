package Java;

import java.util.TreeSet;

class Student implements Comparable<Student> {

    int rollNo;
    String name;
    int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo +
                ", Name: " + name +
                ", Mark: " + mark;
    }
}

public class Task10 {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student(103, "Ravi", 78));
        students.add(new Student(101, "Guna", 85));
        students.add(new Student(105, "Kumar", 88));
        students.add(new Student(102, "Priya", 90));
        students.add(new Student(104, "Divya", 82));

        System.out.println("Students Sorted by Roll Number:");

        for(Student s : students) {
            System.out.println(s);
        }
    }
}