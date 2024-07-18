package builder;

public class Main {
    public static void main(String[] args) {
        /** Version 1, In which Student class will give it\'s builder instance
         * Also. StudentBuilder will create and return the Student
         */
        Student st = Student.getBuilder().name("John").age(32).gradYear(2010).build();
        st.setBatch("Oct 2023");
        st.setPsp(89.98);

        System.out.println("Student age: " + st.getAge());
        System.out.println("Student name: " + st.getName());
        System.out.println("Student batch: " + st.getBatch());
        System.out.println("Student gradYear: " + st.getGradYear());
        System.out.println("Student psp: " + st.getPsp());
    }
}
