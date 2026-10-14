package com.codsoft;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
 
/** Student Database: stores student ID, name and registered courses. */
public class StudentDatabase {
    private final Map<String, Student> students = new LinkedHashMap<>();
 
    public boolean addStudent(Student student) {
        if (students.containsKey(student.getId())) return false;
        students.put(student.getId(), student);
        return true;
    }
 
    public Student getStudent(String id) {
        return id == null ? null : students.get(id.trim().toUpperCase());
    }
 
    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }
}
 
