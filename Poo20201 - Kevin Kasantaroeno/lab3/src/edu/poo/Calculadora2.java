package edu.poo;

public class Calculadora2 {
    public static void main(String[] args) {
		
		// calculado v2
		double[] valoresEsquerda = { 100.0d, 25.0d, 225.0d, 11.0d };
		double[] valoresDireita = { 50.0d, 92.0d, 17.0d, 3.0d };
		char[] operacoes = { 'd', 'a', 's', 'm' };
		double[] resultados = new double[operacoes.length];


		for (int i = 0; i < operacoes.length; i++) {
			if (operacoes[i] == 'a')
				resultados[i] = valoresEsquerda[i] + valoresDireita[i];
			else if (operacoes[i] == 's')
				resultados[i] = valoresEsquerda[i] - valoresDireita[i];
			else if (operacoes[i] == 'd')
				resultados[i] = valoresDireita[i] != 0.0d ? valoresEsquerda[i] / valoresDireita[i] : 0.0d;
			else if (operacoes[i] == 'm')
				resultados[i] = valoresEsquerda[i] * valoresDireita[i];
			else {
				System.out.println("erro - codigo de operacao invalido");
				resultados[i] = 0.0d;
			}
		}

		for (double resultado : resultados) {
			System.out.print("resultado = ");
			System.out.println(resultado);
		}
	}
}
