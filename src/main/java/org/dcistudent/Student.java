package org.dcistudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private boolean isGraduate = false;
    private String course = "";
    private static final ArrayList<String> courses = new ArrayList<>(Arrays.asList("Java", "Web Dev", "Data"));

    /**
     * Set whether the student is a graduate student.
     *
     * @param isGraduate true if the student is a graduate student, false otherwise
     * @return this Student object
     */
    public Student setGraduate(boolean isGraduate) {
        this.isGraduate = isGraduate;

        return this;
    }

    /**
     * Set the course the student is taking.
     *
     * @param course the course the student is taking
     * @return this Student object
     */
    public Student setCourse(String course) {
        if (!courses.contains(course)) {
            throw new IllegalArgumentException("Invalid course");
        }

        this.course = course;

        return this;
    }

    /**
     * Get whether the student is a graduate student.
     *
     * @return true if the student is a graduate student, false otherwise
     */
    public boolean isGraduate() {
        return isGraduate;
    }

    /**
     * Get the course the student is taking.
     *
     * @return the course the student is taking
     */
    public String getCourse() {
        return course;
    }

    /**
     * Get the list of courses the student can take.
     *
     * @return the list of courses the student can take
     */
    public static List<String> getAvailableCourses() {
        return courses;
    }
}
