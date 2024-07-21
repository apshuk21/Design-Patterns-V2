package prototypeandregistry;

public class Student implements Prototype<Student> {
    private int id;
    private String name;
    private String batch;

    public Student() {}

    public Student (Student st) {
        this.id = st.id;
        this.name = st.name;
        this.batch = st.batch;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
