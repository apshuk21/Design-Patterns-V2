package prototypeandregistry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentRegistry {

    private Map<String, Student> students = new HashMap<>();

    public void register(String key, Student st) {
        students.put(key, st);
    }

    public Student getStudent(String key) {
        // Should return the prototype copy
        Student st = students.get(key);
        return st.copy();
    }

}
