package edu.poo;

public class Matrizes1_2 {
    public static void main(String[] args) {
		// matrizes
		//float[] valores = new float[3];
		//valores[0] = 10.0f;
		//valores[1] = 20.0f;
		//valores[2] = 15.0f;

		//float[][] valores = new float[3][3];

		//float[] valores = { 10.0f, 20.0f, 15.0f };
		float[][] valores = {{ 10.0f, 20.0f, 15.0f }, {10.0f, 20.0f, 15.0f }, {10.0f, 20.0f, 15.0f }};

		//float soma = 0.0f;
		float somaLinha = 0.0f;

		//for(int i= 0; i < valores.length; i++)
		//	soma += valores[i];

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[0].length; j++) {
				somaLinha += valores[i][j];
				System.out.print(valores[i][j] + "\t");
			}

			System.out.println("somaLinha = " + somaLinha);
			somaLinha = 0.0f;
		}

		//System.out.println(soma);
	}
}
