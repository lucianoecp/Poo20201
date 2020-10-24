package edu.poo;

public class Calculadora3 {
    public static void main(String[] args) {
		
		// calculado v3
		double[] valoresEsquerda = { 100.0d, 25.0d, 225.0d, 11.0d };
		double[] valoresDireita = { 50.0d, 92.0d, 17.0d, 3.0d };
		char[] operacoes = { 'd', 'a', 's', 'm' };
		double[] resultados = new double[operacoes.length];


		for (int i = 0; i < operacoes.length; i++) {
			switch (operacoes[i]) {
				case 'a':
					resultados[i] = valoresEsquerda[i] + valoresDireita[i];
					break;
				case 's':
					resultados[i] = valoresEsquerda[i] - valoresDireita[i];
					break;
				case 'd':
					resultados[i] = valoresDireita[i] != 0.0d ? valoresEsquerda[i] / valoresDireita[i] : 0.0d;
					break;
				case 'm':
					resultados[i] = valoresEsquerda[i] * valoresDireita[i];
					break;
				default:
					System.out.println("erro - codigo de operacao invalido");
					resultados[i] = 0.0d;
					break;
			}
		}

		for (double resultado : resultados) {
			System.out.print("resultado = ");
			System.out.println(resultado);
		}
	}
}
