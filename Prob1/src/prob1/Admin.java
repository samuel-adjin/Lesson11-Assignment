package prob1;

import java.util.*;

public class Admin {

    public static HashMap<Key, Student> processStudents(List<Student> students) {
        //implement
        HashMap<Key, Student> studentsHashMap = new HashMap<>();
        for (Student student : students) {
            Key key = new Key(student.getFirstName(), student.getLastName());
            studentsHashMap.put(key, student);
        }

        return studentsHashMap;
    }
}
