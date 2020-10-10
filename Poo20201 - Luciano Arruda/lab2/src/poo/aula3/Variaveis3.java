package poo.aula3;

public class Variaveis3 {

    public static void main(String[] args) {
        /* A linguagem Java possui diversos tipos de dados pré-definidos:
        também conhecidos como tipos primitivos.

        Um deles é o booleano que representa os valores lógicos:
        - Verdadeiro (True) e Falso (False)
        */
        double ratingPython = 11.28;
        double changePython = 2.19;

        double ratingJava = 12.56;
        double changeJava = -4.32;

        int mes = 10, ano = 2020;

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("|fonte: TIOBE-Index: " + mes + "/" + ano + "\t\t\t|");
        System.out.println("|Prog. Language\t\t|Ratings\t|Change\t|");
        System.out.println("-------------------------------------------------");
        System.out.println("|Python:\t\t|" + ratingPython + "\t\t|+" + changePython + "%\t|");
        System.out.println("|Java:\t\t\t|" + ratingJava + "\t\t|" + changeJava + "%\t|");
        System.out.println("-------------------------------------------------");
        
        boolean pythonSuperaJava = true;
        System.out.print("\nPython vai superar Java?\n"+pythonSuperaJava); 
        //              ou
        pythonSuperaJava = false;
        System.out.println(pythonSuperaJava); 

    }
    
}
