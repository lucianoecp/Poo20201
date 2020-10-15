package edu.poo;

public class Variaveis7 {
    public static void main(String[] args){
        int valorA = 30;
        int valorB = 8;
        int valorC = 5;
        int valorD = 2;

        int resultado1 = valorA-valorB/valorC;

        int resultado2 = (valorA-valorB)/valorC;

        System.out.println(resultado1);//29
        System.out.println(resultado2);//4

        int resultado3 = valorA/valorC*valorD+valorB;

        int resultado4 = valorA/(valorC*valorD+valorB);

        System.out.println(resultado3);//20
        System.out.println(resultado4);//1

        int resultado5 = valorD + --valorC*valorB++;
        System.out.println(resultado5);//34

    }
}
