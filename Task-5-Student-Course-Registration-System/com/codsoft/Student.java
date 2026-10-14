package com.codsoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private final String id;
    private final String name;
    private final List<String> registeredCourses = new ArrayList<>();

    public Student(String id, String name) {
        this.id = id.toUpperCase();
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    public List<String> getRegisteredCourses() {
        return Collections.unmodifiableList(registeredCourses);
    }

    public boolean isRegisteredFor(String courseCode) {
        return registeredCourses.contains(courseCode);
    }

    void addCourse(String courseCode) { registeredCourses.add(courseCode); }

    void removeCourse(String courseCode) { registeredCourses.remove(courseCode); }

    @Override
    public String toString() {
        return String.format("%s - %s | Courses: %s", id, name,
                registeredCourses.isEmpty() ? "none" : String.join(", ", registeredCourses));
    }
}
