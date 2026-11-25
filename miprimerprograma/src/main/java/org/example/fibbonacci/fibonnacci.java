package org.example.fibbonacci;

import java.util.Scanner;

public class fibonnacci {


    public static void fibonnaciSerie(int pocision){
        int primerNumero = 0;
        int segundoNumero = 1;
        int fibonacci = 0;


        System.out.print(primerNumero + "\\n " );
        System.out.print(segundoNumero + "\\n ");

        for (int i = 2; i < pocision; i++) {
            fibonacci = primerNumero + segundoNumero;
            System.out.println(fibonacci + " ");

            primerNumero = segundoNumero;
            segundoNumero = fibonacci;
        }
    }

    public static void main(String[] args) {
        System.out.println("Ingrese el indice del fibonnacci a calcular:");

        Scanner entrada = new Scanner(System.in);
        int numeroRecibido = entrada.nextInt();

        fibonnaciSerie(numeroRecibido);
    }
}
