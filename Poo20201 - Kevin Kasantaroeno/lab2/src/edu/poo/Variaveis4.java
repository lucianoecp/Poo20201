package edu.poo;

public class Variaveis4 {
    public static void main(String[] args){
        int primeiroValor = 400;
        int outroValor = primeiroValor;
        primeiroValor = 200;
        System.out.println(String.format("%s, %s", primeiroValor, outroValor));
    }
}
