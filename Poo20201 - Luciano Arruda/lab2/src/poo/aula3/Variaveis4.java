package poo.aula3;

public class Variaveis4 {
    
    public static void main(String[] args) 
    {
        // tipos primitivos são armazenados por valor:
        int valorInicial = 40;
        int valorFinal = 100;
        System.out.println(String.format("inicial: %s, final: %s", valorInicial, valorFinal));

        int aux;
        // swap
        aux = valorFinal;
        valorFinal = valorInicial;
        valorInicial = aux;
        System.out.println(String.format("inicial: %s, final: %s", valorInicial, valorFinal));


    }
    
}
