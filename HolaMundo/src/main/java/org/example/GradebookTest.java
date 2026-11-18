package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de calificaciones de la clase");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = sc.nextLine();

        Gradebook gradebook = new Gradebook(nombreCurso);
        System.out.println("Curso creado desde Consola");
        gradebook.setCourseName(nombreCurso);
        gradebook.displayMessage();

        Gradebook gradebook2 = new Gradebook("Mi Curso de Prog 1 UCAldas");
        System.out.println("Curso creado desde el Main()");
        gradebook2.displayMessage();

    }
}