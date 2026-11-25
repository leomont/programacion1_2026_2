package org.example.fibbonacci;

public class recursiveFibonnacci {

    public static int recursiveFibonnacci(int pocision){

        if(pocision <=1){
            return pocision;
        }
        else{
            return recursiveFibonnacci(pocision-2) + recursiveFibonnacci(pocision-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("fibonnacci -----------");

        int pos = 7;
        for (int i = 0; i < pos; i++) {
            System.out.println(recursiveFibonnacci(i) + "\n");
        }
    }
}
