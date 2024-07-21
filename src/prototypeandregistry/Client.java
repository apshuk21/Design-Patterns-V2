package prototypeandregistry;

public class Client {
    static Student getAStudentCopy(Student st) {
        return st.copy();
    }

    public static void fillRegistry(StudentRegistry stRegistry, String key, Student st) {
        stRegistry.register(key, st);
    }

    public static void main(String[] args) {
        /**
         * Create prototypes of Student and IntelligentStudent.
         * Register these prototypes in the StudentRegistry
         */
        Student st = new Student();
        Student ist = new IntelligentStudent();


        StudentRegistry str = new StudentRegistry();

        Student stClone = getAStudentCopy(st);

        Student istClone = getAStudentCopy(ist);

        fillRegistry(str, "normal", st);
        fillRegistry(str, "intelligent", ist);

        // Get the intelligent student from the registry
        IntelligentStudent istProto = (IntelligentStudent) str.getStudent("intelligent");
        System.out.println(istProto.getQa());
    }
}
