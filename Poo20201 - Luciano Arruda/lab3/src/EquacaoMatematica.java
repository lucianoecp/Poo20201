package edu.poo.app.calculadora;

// v6
public class EquacaoMatematica {
	
	public double valorEsquerda;
	public double valorDireita;
	//public char codigoOperacao;
	public char codigoOperacao = 'a'; // v7
	public double resultado;

	public double getValorEsquerda() {
		return valorEsquerda;
	}

	public void setValorEsquerda(double valorEsquerda) {
		this.valorEsquerda = valorEsquerda;
	}

	public double getValorDireita() {
		return valorDireita;
	}
	
	public void setValorDireita(double valorDireita) {
		this.valorDireita = valorDireita;
	}

	public char getCodigoOperacao() {
		return codigoOperacao;
	}
	public void setCodigoOperacao(char codigoOperacao) {
		this.codigoOperacao = codigoOperacao;
	}

	public double getResultado() { 
		return resultado;
	}

	// v7
	public EquacaoMatematica() {}

	// v7
	public EquacaoMatematica(char codigoOperacao) {
		this.codigoOperacao = codigoOperacao;
	}

	// v7
	public EquacaoMatematica(char codigoOperacao, double valorEsquerda, double valorDireita) {
		this(codigoOperacao);
		this.valorEsquerda = valorEsquerda;
		this.valorDireita = valorDireita;
	}

	// v8
	public void executar(double valorEsquerda, double valorDireita) {
		
		this.valorEsquerda = valorEsquerda;
		this.valorDireita = valorDireita;

		executar();
	}

	public void executar(int valorEsquerda, int valorDireita) {
		
		this.valorEsquerda = valorEsquerda;
		this.valorDireita = valorDireita;

		executar();

		resultado = (int) resultado;
	}

	public void executar() {
		switch (codigoOperacao) {
			case 'a':
				resultado = valorEsquerda + valorDireita;

				break;

			case 's':
				resultado = valorEsquerda - valorDireita;
				
				break;

			case 'd':
				resultado = valorDireita != 0.0d ? valorEsquerda / valorDireita : 0.0d;;

				break;

			case 'm':
				resultado = valorEsquerda * valorDireita;

				break;

			default:
				System.out.println("erro: codigo operacao invalido");
				resultado = 0.0d;

				break;
		}
	}
}
