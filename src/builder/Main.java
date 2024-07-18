package builder;

public class Main {
    public static void main(String[] args) {
        StudentBuilder sb = new StudentBuilder();
        sb.setName("John");
        sb.setAge(32);
        sb.setGradYear(2010);

        Student st = new Student(sb);
        st.setBatch("Oct 2023");
        st.setPsp(89.98);

        System.out.println("Student age: " + st.getAge());
        System.out.println("Student name: " + st.getName());
        System.out.println("Student batch: " + st.getBatch());
        System.out.println("Student gradYear: " + st.getGradYear());
        System.out.println("Student psp: " + st.getPsp());
    }
}
