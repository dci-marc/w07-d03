package org.dcistudent;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Student student = new Student();
        student
            .setGraduate(true)
            .setCourse("Java")
        ;

        System.out.println("Student is a graduate student: " + student.isGraduate());
        System.out.println("Student is taking the course: " + student.getCourse());
    }
}