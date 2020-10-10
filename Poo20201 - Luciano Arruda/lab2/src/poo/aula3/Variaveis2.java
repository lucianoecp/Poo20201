package poo.aula3;

public class Variaveis2
{

    public static void main(String[] args) 
    {
        // O valor da variável pode ser atualizado
        int variavel;
        // System.out.println(variavel); -> ERRO: Tentar imprimir
        // uma variável não inicializada acusa erro ao compilar!
        variavel = 70;
        System.out.println("v1: " + variavel);

        variavel = 707;
        System.out.println("v1: " + variavel + " (valor atualizado)");

        int outraVariavel = 123; 
        System.out.println("v2: " + outraVariavel);

        variavel = outraVariavel;
        System.out.println("v1: " + variavel + " (valor atualizado)");

        outraVariavel = 456;
        System.out.println("v2: " + outraVariavel + " (valor atualizado)");

    }
}