package com.codsoft;

/** Business logic: student registration and course removal, with validation. */
public class RegistrationService {
    private final CourseDatabase courseDb;
    private final StudentDatabase studentDb;

    public RegistrationService(CourseDatabase courseDb, StudentDatabase studentDb) {
        this.courseDb = courseDb;
        this.studentDb = studentDb;
    }

    public String register(String studentId, String courseCode) {
        Student student = studentDb.getStudent(studentId);
        if (student == null) return "Error: student not found.";

        Course course = courseDb.getCourse(courseCode);
        if (course == null) return "Error: course not found.";

        if (student.isRegisteredFor(course.getCode()))
            return "Error: already registered for " + course.getCode() + ".";

        if (!course.hasSlot())
            return "Error: " + course.getCode() + " is full.";

        for (String code : student.getRegisteredCourses()) {
            Course existing = courseDb.getCourse(code);
            if (existing != null && existing.getSchedule().equalsIgnoreCase(course.getSchedule()))
                return "Error: schedule clash with " + existing.getCode() + " (" + existing.getSchedule() + ").";
        }

        course.enroll();
        student.addCourse(course.getCode());
        return "Success: " + student.getName() + " registered for " + course.getCode()
                + " - " + course.getTitle() + ".";
    }

    public String drop(String studentId, String courseCode) {
        Student student = studentDb.getStudent(studentId);
        if (student == null) return "Error: student not found.";

        Course course = courseDb.getCourse(courseCode);
        if (course == null) return "Error: course not found.";

        if (!student.isRegisteredFor(course.getCode()))
            return "Error: " + student.getName() + " is not registered for " + course.getCode() + ".";

        course.drop();
        student.removeCourse(course.getCode());
        return "Success: " + course.getCode() + " dropped for " + student.getName() + ".";
    }
}
