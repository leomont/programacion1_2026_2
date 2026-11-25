package org.example.gradebook;

import java.util.Scanner;

public class classAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gradeCounter = 1;
        int total = 0;

        while (gradeCounter <= 10) {
            System.out.print("Ingresar una nota: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
        }

        int average = total / 10;
        System.out.printf("%nTotal de la suma de las 10 notas es %d%n", total);
        System.out.printf("El PROMEDIO %d%n", average);

    }
}
