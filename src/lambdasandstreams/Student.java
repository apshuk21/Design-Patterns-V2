package lambdasandstreams;

import java.util.Comparator;

public class Student {
    private String name;
    private int psp;

    public Student(String name, int psp) {
        this.name = name;
        this.psp = psp;
    }

    public String getName() {
        return name;
    }

    public int getPsp() {
        return psp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", psp=" + psp +
                '}';
    }
}
