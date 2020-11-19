package edu.poo.app.calculadora;

public class Calculadora8 {
    public static void main(String[] args) {
		// v7
		//EquacaoMatematica equacaoMatematica = new EquacaoMatematica();
		//equacaoMatematica.executar();
		//System.out.print("resultado=");
		//System.out.println(equacaoMatematica.getResultado());

		/* */
		// v6
		EquacaoMatematica[] equacoes = new EquacaoMatematica[4];
		//equacoes[0] = criar(100.0d, 50.0d, 'd');
		//equacoes[1] = criar(25.0d, 92.0d, 'a');
		//equacoes[2] = criar(225.0d, 17.0d, 's');
		//equacoes[3] = criar(11.0d, 3.0d, 'm');

		// v7
		equacoes[0] = new EquacaoMatematica('d', 100.0d, 50.0d);
		equacoes[1] = new EquacaoMatematica('a', 25.0d, 92.0d);
		equacoes[2] = new EquacaoMatematica('s', 225.0d, 17.0d);
		equacoes[3] = new EquacaoMatematica('m', 11.0d, 3.0d);

		// v6
		for (EquacaoMatematica equacao : equacoes) {
			equacao.executar();
			System.out.print("resultado = ");
			System.out.println(equacao.getResultado());
		}

		// v8
		System.out.println();
		System.out.println("usando sobrecarga");
		System.out.println();

		double valorEsquerda = 9.0d;
		double valorDireita = 4.0d;

		int inteiroEsquerda = 9;
		int inteiroDireita = 4;

		EquacaoMatematica equacaoComSobrecarga = new EquacaoMatematica('d');
		equacaoComSobrecarga.executar(valorEsquerda, valorDireita);

		System.out.print("resultado: ");
		System.out.println(equacaoComSobrecarga.getResultado());

		equacaoComSobrecarga.executar(inteiroEsquerda, inteiroDireita);
		
		System.out.print("resultado: ");
		System.out.println(equacaoComSobrecarga.getResultado());
		
		equacaoComSobrecarga.executar((double) inteiroEsquerda, inteiroDireita);
		
		System.out.print("resultado: ");
		System.out.println(equacaoComSobrecarga.getResultado());
	}

	// v6
	//public static EquacaoMatematica criar(double valorEsquerda, double valorDireita, char codigoOperacao) {
	//	EquacaoMatematica equacao = new EquacaoMatematica();
	//	equacao.setValorEsquerda(valorEsquerda);
	//	equacao.setValorDireita(valorDireita);
	//	equacao.setCodigoOperacao(codigoOperacao);
	//
	//	return equacao;
	//}	
}

