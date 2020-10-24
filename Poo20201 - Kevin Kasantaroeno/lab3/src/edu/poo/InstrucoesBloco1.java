package edu.poo;

public class InstrucoesBloco1 {
    public static void main(String[] args) {
		// instrucoes de bloco
		int valor1 = 10, valor2 = 4, diff;

		if (valor1 > valor2) {
			diff = valor1 - valor2;
		
			System.out.println("valor1 eh maior");
			System.out.println(diff);
		} else if (valor2 > valor1) {
			diff = valor2 - valor1;
			
			System.out.println("valor2 eh maior");
			System.out.println(diff);
		} else
			System.out.println("valor1 e valor2 sao iguais");
	}
}
