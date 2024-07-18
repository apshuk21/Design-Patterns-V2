package builder;

public class Main {
    public static void main(String[] args) {
        /** Version 2, There is a problem with version 1.
         * There is a way to by-pass validation and create a Student object.
         * Check the below code.
         * What if we make Student Builder as an inner class of Student class
         */
//        StudentBuilder sb = new StudentBuilder().name("Mark").age(25).gradYear(2021);
//        Student st1 = new Student(sb);
//        st1.setBatch("Oct 2022");
//        st1.setPsp(85.98);
//
//        System.out.println("Student 1 age: " + st1.getAge());
//        System.out.println("Student 1 name: " + st1.getName());
//        System.out.println("Student 1 batch: " + st1.getBatch());
//        System.out.println("Student 1 gradYear: " + st1.getGradYear());
//        System.out.println("Student 1 psp: " + st1.getPsp());

        Student st = Student.getBuilder().name("John").age(22).gradYear(2010).build();
        st.setBatch("Oct 2023");
        st.setPsp(89.98);

        System.out.println("Student age: " + st.getAge());
        System.out.println("Student name: " + st.getName());
        System.out.println("Student batch: " + st.getBatch());
        System.out.println("Student gradYear: " + st.getGradYear());
        System.out.println("Student psp: " + st.getPsp());
    }
}
