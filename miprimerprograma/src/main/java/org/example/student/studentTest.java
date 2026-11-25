package org.example.student;

import org.example.gradebook.Gradebook;

public class studentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Jose Perea ", 85.0);
        Student student2 = new Student("Juan Perez ", 55.0);
        Gradebook myGradebook = new Gradebook("CS101 Introduction to Java Programming");

        myGradebook.setCoursename("Introduction to Java Programming");

        System.out.printf("%s's letter grade is: %s%n", student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", student2.getName(), student2.getLetterGrade());
    }
}
