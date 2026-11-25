package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese la primera nota: ");
        Scanner sc = new Scanner(System.in);
        int nota1 = sc.nextInt();

        System.out.println("Ingrese la segunda nota: ");
        Scanner sc2 = new Scanner(System.in);
        int nota2 = sc2.nextInt();

       int  resultado = nota1 + nota2;

        if (resultado >= 7 && resultado <= 10) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }


    }
}