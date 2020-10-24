package edu.poo;

public class AtribuicaoCondicional1 {
    public static void main(String[] args) {
		// atribuicao condicional
		int valor1 = 7;
		int valor2 = 5;
		int maiorValor = valor1 > valor2 ? valor1 : valor2;

		System.out.println(maiorValor); // 7

		float alunos = 30;
		float salas = 4;
		float alunosPorSala= salas == 0.0f ? 0.0f : alunos/salas;
		
		System.out.println(alunosPorSala); // 7.5
	}
}
