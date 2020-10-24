package edu.poo;

public class Lacos1_1 {
    public static void main(String[] args) {
		// lacos

		// laco while
		int valor = 5;
		int fatorial = 1;

		/*
		while (valor > 1) {
			fatorial *= valor;
			valor -= 1;
		}

		System.out.println(fatorial);
		*/

		// laco while		
		while (valor > 1)
			fatorial *= valor--;

		System.out.println(fatorial);

		// laco do-while
		//valor = 5;
		valor = 150;

		do {
			System.out.print(valor);
			System.out.print(" * 2 = ");
			valor *= 2;
			System.out.println(valor);
		} while (valor < 100);

		// laco for
		//for(int valor = 1; valor < 100; valor *= 2) {
		//for(valor = 1; valor < 100; valor *= 2) {
		//for(valor = 1; valor < 10; ++valor) {
		//for(int valor1 = 1, valor2 = 2; (valor1 < 10 && valor2 < 5); valor1++, ++valor2) {
		//for(int valor1 = 1, valor2 = 2; valor1 < 10; valor1 = valor2++) {
		for(int valor1 = 1, valor2 = 2; valor1 < 10; valor1 = ++valor2) {
			System.out.println(valor1);
			System.out.println(valor2);
		}

	}
}
