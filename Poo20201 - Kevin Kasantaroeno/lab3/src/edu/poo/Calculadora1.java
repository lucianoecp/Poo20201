package edu.poo;

public class Calculadora1 {
    public static void main(String[] args) {
		double valor1 = 100.0d;
		double valor2 = 50.0d;
		//double valor2 = 0.0d;
		double resultado;
		char codigoOperacao = 'd';

		if (codigoOperacao == 'a')
			resultado = valor1 + valor2;
		else if (codigoOperacao == 's')
			resultado = valor1 - valor2;
		else if (codigoOperacao == 'd') {
			//if (valor2 != 0.0d)
			//	resultado = valor1 / valor2;
			//else
			//	resultado = 0.0d;

			resultado = valor2 != 0.0d ? valor1 / valor2 : 0.0d;

		} else if (codigoOperacao == 'm')
			resultado = valor1 * valor2;
		else {
			System.out.println("erro - codigo de operacao invalido");
			resultado = 0.0d;
		}

		System.out.println(resultado);
	}
}
