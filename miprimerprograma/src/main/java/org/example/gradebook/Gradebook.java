package org.example.gradebook;

import java.util.Scanner;

public class Gradebook {

    private String coursename;

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Gradebook(String coursename) {
        this.coursename = coursename;
    }

    public void displayMessage() {
        System.out.printf("Bienvenido al libro de calificaciones para%n%s!%n%n", getCoursename());
    }

    public void determineClassAverage()
    {


        Scanner input = new Scanner(System.in);
        int gradeCounter = 1;
        int total = 0;
        int grade = 0;
        int average = 0;

        while (gradeCounter <= 10) {
            System.out.print("Ingresar una nota: ");

            grade = input.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("Nota invalida. Ingrese una nota entre 0 y 100.");
                total += grade;
                gradeCounter++;
            }


        }

        average = total / 10;
        System.out.printf("%nTotal de la suma de las 10 notas es %d%n", total);
        System.out.printf("El PROMEDIO %d%n", average);

    }
}
